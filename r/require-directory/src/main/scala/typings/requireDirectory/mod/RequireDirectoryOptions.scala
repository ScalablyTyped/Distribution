package typings.requireDirectory.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequireDirectoryOptions[T, U] extends js.Object {
  
  /**
    * @description RegExp or function for blacklisting modules
    * @default undefined
    */
  var exclude: js.UndefOr[RegExp | CheckPathFn] = js.native
  
  /**
    * @description array of file extensions that will be included in resulting hash as modules
    * @default "['js', 'json', 'coffee']"
    */
  var extensions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * @description RegExp or function for whitelisting modules
    * @default undefined
    */
  var include: js.UndefOr[RegExp | CheckPathFn] = js.native
  
  /**
    * @description option to include subdirectories
    * @default true
    */
  var recurse: js.UndefOr[Boolean] = js.native
  
  /**
    * @description function for renaming modules in resulting hash
    * @param name name of required module
    * @returns transformed name of module
    * @default "change nothing"
    */
  var rename: js.UndefOr[js.Function1[/* name */ String, String]] = js.native
  
  /**
    * @description function that will be called for each required module
    * @param obj required module
    * @returns transformed module OR nothing (in second case module itself will be added to hash)
    * @default "change nothing"
    */
  var visit: js.UndefOr[js.Function1[/* obj */ T, U | Unit]] = js.native
}
object RequireDirectoryOptions {
  
  @scala.inline
  def apply[T, U](): RequireDirectoryOptions[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequireDirectoryOptions[T, U]]
  }
  
  @scala.inline
  implicit class RequireDirectoryOptionsOps[Self <: RequireDirectoryOptions[_, _], T, U] (val x: Self with (RequireDirectoryOptions[T, U])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExcludeFunction1(value: /* path */ String => Boolean): Self = this.set("exclude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExclude(value: RegExp | CheckPathFn): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setIncludeFunction1(value: /* path */ String => Boolean): Self = this.set("include", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInclude(value: RegExp | CheckPathFn): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setRecurse(value: Boolean): Self = this.set("recurse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurse: Self = this.set("recurse", js.undefined)
    
    @scala.inline
    def setRename(value: /* name */ String => String): Self = this.set("rename", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRename: Self = this.set("rename", js.undefined)
    
    @scala.inline
    def setVisit(value: /* obj */ T => U | Unit): Self = this.set("visit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteVisit: Self = this.set("visit", js.undefined)
  }
}
