package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.accelerate
import typings.reactNativeNavigation.reactNativeNavigationStrings.accelerateDecelerate
import typings.reactNativeNavigation.reactNativeNavigationStrings.decelerate
import typings.reactNativeNavigation.reactNativeNavigationStrings.decelerateAccelerate
import typings.reactNativeNavigation.reactNativeNavigationStrings.linear
import typings.reactNativeNavigation.reactNativeNavigationStrings.overshoot
import typings.reactNativeNavigation.reactNativeNavigationStrings.spring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeNavigation.anon.Factor
  - typings.reactNativeNavigation.anon.Type
  - typings.reactNativeNavigation.anon.`1`
  - typings.reactNativeNavigation.anon.`2`
  - typings.reactNativeNavigation.anon.`3`
  - typings.reactNativeNavigation.anon.Tension
  - typings.reactNativeNavigation.anon.AllowsOverdamping
*/
trait Interpolation extends js.Object
object Interpolation {
  
  @scala.inline
  def `2`(`type`: accelerateDecelerate): Interpolation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interpolation]
  }
  
  @scala.inline
  def `1`(`type`: decelerateAccelerate): Interpolation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interpolation]
  }
  
  @scala.inline
  def AllowsOverdamping(`type`: spring): Interpolation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interpolation]
  }
  
  @scala.inline
  def `3`(`type`: linear): Interpolation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interpolation]
  }
  
  @scala.inline
  def Factor(`type`: accelerate): Interpolation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interpolation]
  }
  
  @scala.inline
  def Type(`type`: decelerate): Interpolation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interpolation]
  }
  
  @scala.inline
  def Tension(`type`: overshoot): Interpolation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interpolation]
  }
}
