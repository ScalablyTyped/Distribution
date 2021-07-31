package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailOptions extends StObject {
  
  /**
    * Numerical threshold at which an email address is considered invalid
    */
  var errorLevel: js.UndefOr[Double | Boolean] = js.undefined
  
  /**
    * Number of atoms required for the domain. Be careful since some domains, such as io, directly allow email.
    */
  var minDomainAtoms: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a list of acceptable TLDs.
    */
  var tldWhitelist: js.UndefOr[js.Array[String] | js.Object] = js.undefined
}
object EmailOptions {
  
  @scala.inline
  def apply(): EmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailOptions]
  }
  
  @scala.inline
  implicit class EmailOptionsMutableBuilder[Self <: EmailOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorLevel(value: Double | Boolean): Self = StObject.set(x, "errorLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorLevelUndefined: Self = StObject.set(x, "errorLevel", js.undefined)
    
    @scala.inline
    def setMinDomainAtoms(value: Double): Self = StObject.set(x, "minDomainAtoms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDomainAtomsUndefined: Self = StObject.set(x, "minDomainAtoms", js.undefined)
    
    @scala.inline
    def setTldWhitelist(value: js.Array[String] | js.Object): Self = StObject.set(x, "tldWhitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTldWhitelistUndefined: Self = StObject.set(x, "tldWhitelist", js.undefined)
    
    @scala.inline
    def setTldWhitelistVarargs(value: String*): Self = StObject.set(x, "tldWhitelist", js.Array(value :_*))
  }
}
