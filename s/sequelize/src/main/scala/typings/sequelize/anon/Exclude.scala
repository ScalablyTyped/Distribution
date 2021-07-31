package typings.sequelize.anon

import typings.sequelize.mod.FindOptionsAttributesArray
import typings.sequelize.mod.cast
import typings.sequelize.mod.fn
import typings.sequelize.mod.literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exclude extends StObject {
  
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  var include: js.UndefOr[FindOptionsAttributesArray] = js.undefined
}
object Exclude {
  
  @scala.inline
  def apply(): Exclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exclude]
  }
  
  @scala.inline
  implicit class ExcludeMutableBuilder[Self <: Exclude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: FindOptionsAttributesArray): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: (String | literal | (js.Tuple2[String | cast | fn | literal, String]) | fn | cast)*): Self = StObject.set(x, "include", js.Array(value :_*))
  }
}
