package typings.stringifyEntities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringifyEntitiesOptions extends js.Object {
  
  /**
    * Only needed when operating dangerously with `omitOptionalSemicolons: true`.
    * Create character references which don’t fail in attributes (`boolean?`, default: `false`).
    */
  var attribute: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to only escape possibly dangerous characters (`boolean`, default: `false`).
    * Those characters are `"`, `&`, `'`, `<`, `>`, and `` ` ``.
    */
  var escapeOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to omit semicolons when possible (`boolean?`, default: `false`).
    * **Note**: This creates what HTML calls “parse errors” but is otherwise still valid HTML — don’t use this except when building a minifier.
    *
    * Omitting semicolons is possible for legacy named references in certain cases, and numeric references in some cases.
    */
  var omitOptionalSemicolons: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to only escape the given subset of characters (`Array.<string>`).
    */
  var subset: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Prefer named character references (`&amp;`) where possible (`boolean?`, default: `false`).
    */
  var useNamedReferences: js.UndefOr[Boolean] = js.native
  
  /**
    * Prefer the shortest possible reference, if that results in less bytes (`boolean?`, default: `false`).
    * **Note**: `useNamedReferences` can be omitted when using `useShortestReferences`.
    */
  var useShortestReferences: js.UndefOr[Boolean] = js.native
}
object StringifyEntitiesOptions {
  
  @scala.inline
  def apply(): StringifyEntitiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringifyEntitiesOptions]
  }
  
  @scala.inline
  implicit class StringifyEntitiesOptionsOps[Self <: StringifyEntitiesOptions] (val x: Self) extends AnyVal {
    
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
    def setAttribute(value: Boolean): Self = this.set("attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    
    @scala.inline
    def setEscapeOnly(value: Boolean): Self = this.set("escapeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeOnly: Self = this.set("escapeOnly", js.undefined)
    
    @scala.inline
    def setOmitOptionalSemicolons(value: Boolean): Self = this.set("omitOptionalSemicolons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmitOptionalSemicolons: Self = this.set("omitOptionalSemicolons", js.undefined)
    
    @scala.inline
    def setSubsetVarargs(value: String*): Self = this.set("subset", js.Array(value :_*))
    
    @scala.inline
    def setSubset(value: js.Array[String]): Self = this.set("subset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubset: Self = this.set("subset", js.undefined)
    
    @scala.inline
    def setUseNamedReferences(value: Boolean): Self = this.set("useNamedReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNamedReferences: Self = this.set("useNamedReferences", js.undefined)
    
    @scala.inline
    def setUseShortestReferences(value: Boolean): Self = this.set("useShortestReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseShortestReferences: Self = this.set("useShortestReferences", js.undefined)
  }
}
