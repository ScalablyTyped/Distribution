package typings.sharepoint.Srch

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.sharepointStrings.AND
import typings.sharepoint.sharepointStrings.OR
import typings.sharepoint.sharepointStrings.and_
import typings.sharepoint.sharepointStrings.or_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefinementCategory extends StObject {
  
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
  implicit class RefinementCategoryMutableBuilder[Self <: RefinementCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setK(value: Boolean): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM(value: StringDictionary[String]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMNull: Self = StObject.set(x, "m", null)
    
    @scala.inline
    def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: String | and_ | or_ | AND | OR): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: js.Array[String]): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTVarargs(value: String*): Self = StObject.set(x, "t", js.Array(value :_*))
  }
}
