package typings.scrollmagic.mod

import typings.scrollmagic.mod.^
import typings.scrollmagic.scrollmagicStrings.enter
import typings.scrollmagic.scrollmagicStrings.leave
import typings.scrollmagic.scrollmagicStrings.progress
import typings.scrollmagic.scrollmagicStrings.remove
import typings.scrollmagic.scrollmagicStrings.start
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type ElementOrSelector = Element | String

type EnterEvent = SceneProgressEvent[enter]

type LeaveEvent = SceneProgressEvent[leave]

type ProgressEvent = SceneProgressEvent[progress]

type RemoveEvent = Event[remove]

type StartEvent = SceneProgressEvent[start]

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typings.scrollmagic.scrollmagicStrings.onEnter
  - typings.scrollmagic.scrollmagicStrings.onCenter
  - typings.scrollmagic.scrollmagicStrings.onLeave
*/
type TriggerHook = _TriggerHook | Double
