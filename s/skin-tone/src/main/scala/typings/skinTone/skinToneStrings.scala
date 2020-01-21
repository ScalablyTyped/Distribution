package typings.skinTone

import typings.skinTone.mod.Tone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object skinToneStrings {
  @js.native
  sealed trait brown extends Tone
  
  @js.native
  sealed trait creamWhite extends Tone
  
  @js.native
  sealed trait darkBrown extends Tone
  
  @js.native
  sealed trait lightBrown extends Tone
  
  @js.native
  sealed trait none extends Tone
  
  @js.native
  sealed trait white extends Tone
  
  @scala.inline
  def brown: brown = "brown".asInstanceOf[brown]
  @scala.inline
  def creamWhite: creamWhite = "creamWhite".asInstanceOf[creamWhite]
  @scala.inline
  def darkBrown: darkBrown = "darkBrown".asInstanceOf[darkBrown]
  @scala.inline
  def lightBrown: lightBrown = "lightBrown".asInstanceOf[lightBrown]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def white: white = "white".asInstanceOf[white]
}

