package typings.seneca

import typings.seneca.mod.LogLevel
import typings.seneca.mod.LogSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object senecaStrings {
  @js.native
  sealed trait all extends LogSpec
  
  @js.native
  sealed trait any extends LogSpec
  
  @js.native
  sealed trait debugPlussign extends LogLevel
  
  @js.native
  sealed trait infoPlussign extends LogLevel
  
  @js.native
  sealed trait none extends LogLevel
  
  @js.native
  sealed trait print extends LogSpec
  
  @js.native
  sealed trait quiet extends LogSpec
  
  @js.native
  sealed trait silent extends LogSpec
  
  @js.native
  sealed trait standard extends LogSpec
  
  @js.native
  sealed trait test extends LogSpec
  
  @js.native
  sealed trait warnPlussign extends LogLevel
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  @scala.inline
  def debugPlussign: debugPlussign = "debug+".asInstanceOf[debugPlussign]
  @scala.inline
  def infoPlussign: infoPlussign = "info+".asInstanceOf[infoPlussign]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def print: print = "print".asInstanceOf[print]
  @scala.inline
  def quiet: quiet = "quiet".asInstanceOf[quiet]
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  @scala.inline
  def test: test = "test".asInstanceOf[test]
  @scala.inline
  def warnPlussign: warnPlussign = "warn+".asInstanceOf[warnPlussign]
}

