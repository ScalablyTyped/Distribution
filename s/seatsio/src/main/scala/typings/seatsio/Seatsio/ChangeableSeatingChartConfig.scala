package typings.seatsio.Seatsio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeableSeatingChartConfig extends js.Object {
  
  var availableCategories: js.UndefOr[js.Array[String]] = js.native
  
  var extraConfig: js.UndefOr[ExtraConfig] = js.native
  
  var filteredCategories: js.UndefOr[js.Array[String]] = js.native
  
  var maxSelectedObjects: js.UndefOr[Double | js.Array[typings.seatsio.anon.Category]] = js.native
  
  var numberOfPlacesToSelect: js.UndefOr[Double] = js.native
  
  var objectColor: js.UndefOr[
    js.Function3[
      /* object */ BookableObject, 
      /* defaultColor */ String, 
      /* extraConfig */ ExtraConfig, 
      String
    ]
  ] = js.native
  
  var objectLabel: js.UndefOr[
    js.Function3[
      /* object */ BookableObject, 
      /* defaultLabel */ String, 
      /* extraConfig */ ExtraConfig, 
      String
    ]
  ] = js.native
  
  var pricing: js.UndefOr[js.Array[PricingConfig]] = js.native
  
  var ticketListings: js.UndefOr[js.Array[TicketListing]] = js.native
  
  var unavailableCategories: js.UndefOr[js.Array[String]] = js.native
}
object ChangeableSeatingChartConfig {
  
  @scala.inline
  def apply(): ChangeableSeatingChartConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeableSeatingChartConfig]
  }
  
  @scala.inline
  implicit class ChangeableSeatingChartConfigOps[Self <: ChangeableSeatingChartConfig] (val x: Self) extends AnyVal {
    
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
    def setAvailableCategoriesVarargs(value: String*): Self = this.set("availableCategories", js.Array(value :_*))
    
    @scala.inline
    def setAvailableCategories(value: js.Array[String]): Self = this.set("availableCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableCategories: Self = this.set("availableCategories", js.undefined)
    
    @scala.inline
    def setExtraConfig(value: ExtraConfig): Self = this.set("extraConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraConfig: Self = this.set("extraConfig", js.undefined)
    
    @scala.inline
    def setFilteredCategoriesVarargs(value: String*): Self = this.set("filteredCategories", js.Array(value :_*))
    
    @scala.inline
    def setFilteredCategories(value: js.Array[String]): Self = this.set("filteredCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilteredCategories: Self = this.set("filteredCategories", js.undefined)
    
    @scala.inline
    def setMaxSelectedObjectsVarargs(value: typings.seatsio.anon.Category*): Self = this.set("maxSelectedObjects", js.Array(value :_*))
    
    @scala.inline
    def setMaxSelectedObjects(value: Double | js.Array[typings.seatsio.anon.Category]): Self = this.set("maxSelectedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSelectedObjects: Self = this.set("maxSelectedObjects", js.undefined)
    
    @scala.inline
    def setNumberOfPlacesToSelect(value: Double): Self = this.set("numberOfPlacesToSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfPlacesToSelect: Self = this.set("numberOfPlacesToSelect", js.undefined)
    
    @scala.inline
    def setObjectColor(
      value: (/* object */ BookableObject, /* defaultColor */ String, /* extraConfig */ ExtraConfig) => String
    ): Self = this.set("objectColor", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteObjectColor: Self = this.set("objectColor", js.undefined)
    
    @scala.inline
    def setObjectLabel(
      value: (/* object */ BookableObject, /* defaultLabel */ String, /* extraConfig */ ExtraConfig) => String
    ): Self = this.set("objectLabel", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteObjectLabel: Self = this.set("objectLabel", js.undefined)
    
    @scala.inline
    def setPricingVarargs(value: PricingConfig*): Self = this.set("pricing", js.Array(value :_*))
    
    @scala.inline
    def setPricing(value: js.Array[PricingConfig]): Self = this.set("pricing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricing: Self = this.set("pricing", js.undefined)
    
    @scala.inline
    def setTicketListingsVarargs(value: TicketListing*): Self = this.set("ticketListings", js.Array(value :_*))
    
    @scala.inline
    def setTicketListings(value: js.Array[TicketListing]): Self = this.set("ticketListings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicketListings: Self = this.set("ticketListings", js.undefined)
    
    @scala.inline
    def setUnavailableCategoriesVarargs(value: String*): Self = this.set("unavailableCategories", js.Array(value :_*))
    
    @scala.inline
    def setUnavailableCategories(value: js.Array[String]): Self = this.set("unavailableCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnavailableCategories: Self = this.set("unavailableCategories", js.undefined)
  }
}
