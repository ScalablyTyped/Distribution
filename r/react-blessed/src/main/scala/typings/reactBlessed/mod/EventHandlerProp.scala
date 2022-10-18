package typings.reactBlessed.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// create event handlers that map to 'blessed' events. see
// https://github.com/Yomguithereal/react-blessed/blob/f5e1f791dea1788745695d557040b91f573f9ef5/src/fiber/events.js
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ key in / * template literal string: on${Capitalize<T>} * / string ]:? E}
  }}}
  */
@js.native
trait EventHandlerProp[T /* <: String */, E /* <: js.Function1[/* args */ scala.Nothing, Unit] */] extends StObject
