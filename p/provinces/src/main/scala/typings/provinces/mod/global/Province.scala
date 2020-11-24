package typings.provinces.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://github.com/substack/provinces#data-format}
  */
@js.native
trait Province extends js.Object {
  
  /**
    * optional array of additional names and abbreviations
    */
  var alt: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * country abbreviation
    */
  var country: String = js.native
  
  /**
    * full name of the province or state
    */
  var name: String = js.native
  
  /**
    * optional region of a country (for example: "Wales")
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * optional 2 or 3 character short name
    */
  var short: js.UndefOr[String] = js.native
}
object Province {
  
  @scala.inline
  def apply(country: String, name: String): Province = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Province]
  }
  
  @scala.inline
  implicit class ProvinceOps[Self <: Province] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltVarargs(value: String*): Self = this.set("alt", js.Array(value :_*))
    
    @scala.inline
    def setAlt(value: js.Array[String]): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setShort(value: String): Self = this.set("short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShort: Self = this.set("short", js.undefined)
  }
}
