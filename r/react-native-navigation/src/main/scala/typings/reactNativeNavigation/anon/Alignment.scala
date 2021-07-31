package typings.reactNativeNavigation.anon

import typings.reactNativeNavigation.reactNativeNavigationStrings.center
import typings.reactNativeNavigation.reactNativeNavigationStrings.fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alignment extends StObject {
  
  /**
    * Set component alignment
    */
  var alignment: js.UndefOr[center | fill] = js.undefined
  
  /**
    * Component reference id, Auto generated if empty
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Name of your component
    */
  var name: String
  
  /**
    * Properties to pass down to the component
    */
  var passProps: js.UndefOr[js.Object] = js.undefined
}
object Alignment {
  
  @scala.inline
  def apply(name: String): Alignment = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alignment]
  }
  
  @scala.inline
  implicit class AlignmentMutableBuilder[Self <: Alignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: center | fill): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassProps(value: js.Object): Self = StObject.set(x, "passProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassPropsUndefined: Self = StObject.set(x, "passProps", js.undefined)
  }
}
