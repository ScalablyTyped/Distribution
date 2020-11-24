package typings.storybookAddons

import typings.storybookAddons.typesMod.StorySortMethod
import typings.storybookAddons.typesMod.ViewMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storybookAddonsStrings {
  
  @scala.inline
  def MOUNT: MOUNT = "MOUNT".asInstanceOf[MOUNT]
  
  @scala.inline
  def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @scala.inline
  def UPDATE: UPDATE = "UPDATE".asInstanceOf[UPDATE]
  
  @scala.inline
  def alphabetical: alphabetical = "alphabetical".asInstanceOf[alphabetical]
  
  @scala.inline
  def centered: centered = "centered".asInstanceOf[centered]
  
  @scala.inline
  def configure: configure = "configure".asInstanceOf[configure]
  
  @scala.inline
  def docs: docs = "docs".asInstanceOf[docs]
  
  @scala.inline
  def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  
  @scala.inline
  def none_ : none_ = "none".asInstanceOf[none_]
  
  @scala.inline
  def padded: padded = "padded".asInstanceOf[padded]
  
  @scala.inline
  def story: story = "story".asInstanceOf[story]
  
  @js.native
  sealed trait MOUNT extends js.Object
  
  @js.native
  sealed trait NONE extends js.Object
  
  @js.native
  sealed trait UPDATE extends js.Object
  
  @js.native
  sealed trait alphabetical extends StorySortMethod
  
  @js.native
  sealed trait centered extends js.Object
  
  @js.native
  sealed trait configure extends StorySortMethod
  
  @js.native
  sealed trait docs extends ViewMode
  
  @js.native
  sealed trait fullscreen extends js.Object
  
  @js.native
  sealed trait none_ extends js.Object
  
  @js.native
  sealed trait padded extends js.Object
  
  @js.native
  sealed trait story extends ViewMode
}
