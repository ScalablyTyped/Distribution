package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shopify-buy", "Config")
@js.native
open class Config protected () extends StObject {
  def this(attrs: ConfigAttrs) = this()
  
  var apiVersion: String = js.native
  
  var domain: String = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var storefrontAccessToken: String = js.native
}
