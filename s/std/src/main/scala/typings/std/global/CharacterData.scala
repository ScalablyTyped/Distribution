package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CharacterData")
@js.native
/* standard dom */
open class CharacterData ()
  extends StObject
     with typings.std.CharacterData {
  
  /** Returns the first following sibling that is an element, and null otherwise. */
  /* standard dom */
  /* CompleteClass */
  override val nextElementSibling: typings.std.Element | Null = js.native
  
  /** Returns the first preceding sibling that is an element, and null otherwise. */
  /* standard dom */
  /* CompleteClass */
  override val previousElementSibling: typings.std.Element | Null = js.native
}
