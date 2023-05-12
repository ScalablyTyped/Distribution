package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CropRegion extends StObject
@JSImport("shopify-buy", "CropRegion")
@js.native
object CropRegion extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CropRegion & String] = js.native
  
  @js.native
  sealed trait BOTTOM
    extends StObject
       with CropRegion
  /* "BOTTOM" */ val BOTTOM: typings.shopifyBuy.mod.CropRegion.BOTTOM & String = js.native
  
  @js.native
  sealed trait CENTER
    extends StObject
       with CropRegion
  /* "CENTER" */ val CENTER: typings.shopifyBuy.mod.CropRegion.CENTER & String = js.native
  
  @js.native
  sealed trait LEFT
    extends StObject
       with CropRegion
  /* "LEFT" */ val LEFT: typings.shopifyBuy.mod.CropRegion.LEFT & String = js.native
  
  @js.native
  sealed trait RIGHT
    extends StObject
       with CropRegion
  /* "RIGHT" */ val RIGHT: typings.shopifyBuy.mod.CropRegion.RIGHT & String = js.native
  
  @js.native
  sealed trait TOP
    extends StObject
       with CropRegion
  /* "TOP" */ val TOP: typings.shopifyBuy.mod.CropRegion.TOP & String = js.native
}
