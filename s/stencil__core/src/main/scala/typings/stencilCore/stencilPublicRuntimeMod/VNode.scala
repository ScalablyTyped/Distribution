package typings.stencilCore.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VNode extends StObject {
  
  @JSName("$attrs$")
  var DollarattrsDollar: js.UndefOr[Any] = js.undefined
  
  @JSName("$children$")
  var DollarchildrenDollar: js.Array[VNode]
  
  @JSName("$elm$")
  var DollarelmDollar: Any
  
  @JSName("$flags$")
  var DollarflagsDollar: Double
  
  @JSName("$key$")
  var DollarkeyDollar: js.UndefOr[String | Double] = js.undefined
  
  @JSName("$name$")
  var DollarnameDollar: js.UndefOr[String] = js.undefined
  
  @JSName("$tag$")
  var DollartagDollar: String | Double | js.Function
  
  @JSName("$text$")
  var DollartextDollar: String
}
object VNode {
  
  inline def apply(
    DollarchildrenDollar: js.Array[VNode],
    DollarelmDollar: Any,
    DollarflagsDollar: Double,
    DollartagDollar: String | Double | js.Function,
    DollartextDollar: String
  ): VNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$children$")(DollarchildrenDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$elm$")(DollarelmDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$flags$")(DollarflagsDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$tag$")(DollartagDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$text$")(DollartextDollar.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode]
  }
  
  extension [Self <: VNode](x: Self) {
    
    inline def setDollarattrsDollar(value: Any): Self = StObject.set(x, "$attrs$", value.asInstanceOf[js.Any])
    
    inline def setDollarattrsDollarUndefined: Self = StObject.set(x, "$attrs$", js.undefined)
    
    inline def setDollarchildrenDollar(value: js.Array[VNode]): Self = StObject.set(x, "$children$", value.asInstanceOf[js.Any])
    
    inline def setDollarchildrenDollarVarargs(value: VNode*): Self = StObject.set(x, "$children$", js.Array(value*))
    
    inline def setDollarelmDollar(value: Any): Self = StObject.set(x, "$elm$", value.asInstanceOf[js.Any])
    
    inline def setDollarflagsDollar(value: Double): Self = StObject.set(x, "$flags$", value.asInstanceOf[js.Any])
    
    inline def setDollarkeyDollar(value: String | Double): Self = StObject.set(x, "$key$", value.asInstanceOf[js.Any])
    
    inline def setDollarkeyDollarUndefined: Self = StObject.set(x, "$key$", js.undefined)
    
    inline def setDollarnameDollar(value: String): Self = StObject.set(x, "$name$", value.asInstanceOf[js.Any])
    
    inline def setDollarnameDollarUndefined: Self = StObject.set(x, "$name$", js.undefined)
    
    inline def setDollartagDollar(value: String | Double | js.Function): Self = StObject.set(x, "$tag$", value.asInstanceOf[js.Any])
    
    inline def setDollartextDollar(value: String): Self = StObject.set(x, "$text$", value.asInstanceOf[js.Any])
  }
}
