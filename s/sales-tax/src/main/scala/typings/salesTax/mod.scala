package typings.salesTax

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.salesTax.anon.Direct
import typings.salesTax.anon.Rate
import typings.salesTax.mod.SalesTax.SalesTax
import typings.salesTax.salesTaxStrings.business
import typings.salesTax.salesTaxStrings.consumer
import typings.salesTax.salesTaxStrings.national
import typings.salesTax.salesTaxStrings.regional
import typings.salesTax.salesTaxStrings.worldwide
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("sales-tax", JSImport.Namespace)
  @js.native
  val ^ : InstanceType[Instantiable0[SalesTax]] = js.native
  
  object SalesTax {
    
    @js.native
    trait SalesTax extends StObject {
      
      def getAmountWithSalesTax(countryCode: String): js.Promise[SalesTaxAmountResult] = js.native
      def getAmountWithSalesTax(countryCode: String, stateCode: String): js.Promise[SalesTaxAmountResult] = js.native
      def getAmountWithSalesTax(countryCode: String, stateCode: String, amount: Double): js.Promise[SalesTaxAmountResult] = js.native
      def getAmountWithSalesTax(countryCode: String, stateCode: String, amount: Double, taxNumber: String): js.Promise[SalesTaxAmountResult] = js.native
      def getAmountWithSalesTax(countryCode: String, stateCode: String, amount: Unit, taxNumber: String): js.Promise[SalesTaxAmountResult] = js.native
      def getAmountWithSalesTax(countryCode: String, stateCode: Null, amount: Double): js.Promise[SalesTaxAmountResult] = js.native
      def getAmountWithSalesTax(countryCode: String, stateCode: Null, amount: Double, taxNumber: String): js.Promise[SalesTaxAmountResult] = js.native
      def getAmountWithSalesTax(countryCode: String, stateCode: Null, amount: Unit, taxNumber: String): js.Promise[SalesTaxAmountResult] = js.native
      def getAmountWithSalesTax(countryCode: String, stateCode: Unit, amount: Double): js.Promise[SalesTaxAmountResult] = js.native
      def getAmountWithSalesTax(countryCode: String, stateCode: Unit, amount: Double, taxNumber: String): js.Promise[SalesTaxAmountResult] = js.native
      def getAmountWithSalesTax(countryCode: String, stateCode: Unit, amount: Unit, taxNumber: String): js.Promise[SalesTaxAmountResult] = js.native
      
      def getSalesTax(countryCode: String): js.Promise[SalesTaxResult] = js.native
      def getSalesTax(countryCode: String, stateCode: String): js.Promise[SalesTaxResult] = js.native
      def getSalesTax(countryCode: String, stateCode: String, taxNumber: String): js.Promise[SalesTaxResult] = js.native
      def getSalesTax(countryCode: String, stateCode: Null, taxNumber: String): js.Promise[SalesTaxResult] = js.native
      def getSalesTax(countryCode: String, stateCode: Unit, taxNumber: String): js.Promise[SalesTaxResult] = js.native
      
      def getTaxExchangeStatus(countryCode: String): js.Promise[TaxExchangeStatus] = js.native
      def getTaxExchangeStatus(countryCode: String, stateCode: String): js.Promise[TaxExchangeStatus] = js.native
      def getTaxExchangeStatus(countryCode: String, stateCode: String, taxNumber: String): js.Promise[TaxExchangeStatus] = js.native
      def getTaxExchangeStatus(countryCode: String, stateCode: Null, taxNumber: String): js.Promise[TaxExchangeStatus] = js.native
      def getTaxExchangeStatus(countryCode: String, stateCode: Unit, taxNumber: String): js.Promise[TaxExchangeStatus] = js.native
      
      def hasSalesTax(countryCode: String): Boolean = js.native
      
      def hasStateSalesTax(countryCode: String, stateCode: String): Boolean = js.native
      
      def setTaxOriginCountry(countryCode: String): Unit = js.native
      def setTaxOriginCountry(countryCode: String, useRegionalTax: Boolean): Unit = js.native
      
      def toggleEnabledTaxNumberFraudCheck(isEnabled: Boolean): Unit = js.native
      
      def toggleEnabledTaxNumberValidation(isEnabled: Boolean): Unit = js.native
      
      def validateTaxNumber(countryCode: String, taxNumber: String): js.Promise[Boolean] = js.native
    }
    
    trait SalesTaxAmountResult
      extends StObject
         with SalesTaxResult {
      
      var price: Double
      
      var total: Double
    }
    object SalesTaxAmountResult {
      
      inline def apply(
        area: worldwide | national | regional,
        charge: Direct,
        details: js.Array[Rate],
        exchange: business | consumer,
        price: Double,
        rate: Double,
        total: Double,
        `type`: String
      ): SalesTaxAmountResult = {
        val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[SalesTaxAmountResult]
      }
      
      extension [Self <: SalesTaxAmountResult](x: Self) {
        
        inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
        
        inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      }
    }
    
    trait SalesTaxResult extends StObject {
      
      var area: worldwide | national | regional
      
      var charge: Direct
      
      var details: js.Array[Rate]
      
      var exchange: business | consumer
      
      var rate: Double
      
      var `type`: String
    }
    object SalesTaxResult {
      
      inline def apply(
        area: worldwide | national | regional,
        charge: Direct,
        details: js.Array[Rate],
        exchange: business | consumer,
        rate: Double,
        `type`: String
      ): SalesTaxResult = {
        val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[SalesTaxResult]
      }
      
      extension [Self <: SalesTaxResult](x: Self) {
        
        inline def setArea(value: worldwide | national | regional): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
        
        inline def setCharge(value: Direct): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
        
        inline def setDetails(value: js.Array[Rate]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        inline def setDetailsVarargs(value: Rate*): Self = StObject.set(x, "details", js.Array(value*))
        
        inline def setExchange(value: business | consumer): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
        
        inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait TaxExchangeStatus extends StObject {
      
      var area: worldwide | national | regional
      
      var exchange: business | consumer
      
      var exempt: Boolean
    }
    object TaxExchangeStatus {
      
      inline def apply(area: worldwide | national | regional, exchange: business | consumer, exempt: Boolean): TaxExchangeStatus = {
        val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], exempt = exempt.asInstanceOf[js.Any])
        __obj.asInstanceOf[TaxExchangeStatus]
      }
      
      extension [Self <: TaxExchangeStatus](x: Self) {
        
        inline def setArea(value: worldwide | national | regional): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
        
        inline def setExchange(value: business | consumer): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
        
        inline def setExempt(value: Boolean): Self = StObject.set(x, "exempt", value.asInstanceOf[js.Any])
      }
    }
  }
  
  type _To = InstanceType[Instantiable0[SalesTax]]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: InstanceType[Instantiable0[SalesTax]] = ^
}
