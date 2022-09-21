package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The textual content of Element or Attr. If an element has no markup within its content, it has a single child implementing Text that contains the element's text. However, if the element contains markup, it is parsed into information items and Text nodes that form its children. */
@js.native
trait Text
  extends StObject
     with CharacterData
     with Slottable {
  
  /** Splits data at the given offset and returns the remainder as Text node. */
  /* standard dom */
  def splitText(offset: Double): Text = js.native
  
  /** Returns the combined data of all direct Text node siblings. */
  /* standard dom */
  val wholeText: java.lang.String = js.native
}
