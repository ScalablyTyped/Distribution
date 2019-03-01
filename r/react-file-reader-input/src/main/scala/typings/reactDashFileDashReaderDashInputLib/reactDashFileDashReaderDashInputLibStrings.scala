package typings
package reactDashFileDashReaderDashInputLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashFileDashReaderDashInputLibStrings {
  @js.native
  sealed trait binary
    extends reactDashFileDashReaderDashInputLib.reactDashFileDashReaderDashInputMod.FileInputNs.Format
  
  @js.native
  sealed trait buffer
    extends reactDashFileDashReaderDashInputLib.reactDashFileDashReaderDashInputMod.FileInputNs.Format
  
  @js.native
  sealed trait text
    extends reactDashFileDashReaderDashInputLib.reactDashFileDashReaderDashInputMod.FileInputNs.Format
  
  @js.native
  sealed trait url
    extends reactDashFileDashReaderDashInputLib.reactDashFileDashReaderDashInputMod.FileInputNs.Format
  
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def url: url = "url".asInstanceOf[url]
}

