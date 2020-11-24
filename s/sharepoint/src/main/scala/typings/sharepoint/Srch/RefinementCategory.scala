package typings.sharepoint.Srch

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.sharepointStrings.AND
import typings.sharepoint.sharepointStrings.OR
import typings.sharepoint.sharepointStrings.and_
import typings.sharepoint.sharepointStrings.or_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefinementCategory extends js.Object {
  
  /** Use KQL */
  var k: Boolean = js.native
  
  /**  token to display value map */
  var m: StringDictionary[String] | Null = js.native
  
  /** Refiner Name (Mapped property) */
  var n: String = js.native
  
  var o: String | and_ | or_ | AND | OR = js.native
  
  /** Values, prefixed by ǂǂ for taxonomy terms */
  var t: js.Array[String] = js.native
}
object RefinementCategory {
  
  @scala.inline
  def apply(k: Boolean, n: String, o: String | and_ | or_ | AND | OR, t: js.Array[String]): RefinementCategory = {
    val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinementCategory]
  }
  
  @scala.inline
  implicit class RefinementCategoryOps[Self <: RefinementCategory] (val x: Self) extends AnyVal {
    
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
    def setK(value: Boolean): Self = this.set("k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: String): Self = this.set("n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: String | and_ | or_ | AND | OR): Self = this.set("o", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTVarargs(value: String*): Self = this.set("t", js.Array(value :_*))
    
    @scala.inline
    def setT(value: js.Array[String]): Self = this.set("t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM(value: StringDictionary[String]): Self = this.set("m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMNull: Self = this.set("m", null)
  }
}
