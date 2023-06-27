package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Comment")
@js.native
/* standard dom */
open class Comment ()
  extends StObject
     with typings.std.CharacterData {
  def this(data: java.lang.String) = this()
  
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/nextElementSibling)
    */
  /* standard dom */
  /* CompleteClass */
  override val nextElementSibling: typings.std.Element | Null = js.native
  
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/previousElementSibling)
    */
  /* standard dom */
  /* CompleteClass */
  override val previousElementSibling: typings.std.Element | Null = js.native
}
