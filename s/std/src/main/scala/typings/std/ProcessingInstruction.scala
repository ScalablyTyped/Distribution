package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A processing instruction embeds application-specific instructions in XML which can be ignored by other applications that don't recognize them.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProcessingInstruction)
  */
@js.native
trait ProcessingInstruction
  extends StObject
     with CharacterData
     with LinkStyle {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProcessingInstruction/target) */
  /* standard dom */
  val target: java.lang.String = js.native
}
