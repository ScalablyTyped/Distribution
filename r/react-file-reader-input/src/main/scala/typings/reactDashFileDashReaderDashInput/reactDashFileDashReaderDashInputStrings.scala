package typings.reactDashFileDashReaderDashInput

import typings.reactDashFileDashReaderDashInput.reactDashFileDashReaderDashInputMod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashFileDashReaderDashInputStrings {
  @js.native
  sealed trait binary extends Format
  
  @js.native
  sealed trait buffer extends Format
  
  @js.native
  sealed trait text extends Format
  
  @js.native
  sealed trait url extends Format
  
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def url: url = "url".asInstanceOf[url]
}

