package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Substitutiondata extends StObject {
  
  var draft: js.UndefOr[Boolean] = js.undefined
  
  var substitution_data: js.UndefOr[js.Any] = js.undefined
}
object Substitutiondata {
  
  inline def apply(): Substitutiondata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Substitutiondata]
  }
  
  extension [Self <: Substitutiondata](x: Self) {
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    inline def setSubstitution_data(value: js.Any): Self = StObject.set(x, "substitution_data", value.asInstanceOf[js.Any])
    
    inline def setSubstitution_dataUndefined: Self = StObject.set(x, "substitution_data", js.undefined)
  }
}
