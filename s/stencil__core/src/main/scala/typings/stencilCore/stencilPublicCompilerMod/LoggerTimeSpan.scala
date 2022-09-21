package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggerTimeSpan extends StObject {
  
  def duration(): Double = js.native
  
  def finish(finishedMsg: String): Double = js.native
  def finish(finishedMsg: String, color: String): Double = js.native
  def finish(finishedMsg: String, color: String, bold: Boolean): Double = js.native
  def finish(finishedMsg: String, color: String, bold: Boolean, newLineSuffix: Boolean): Double = js.native
  def finish(finishedMsg: String, color: String, bold: Unit, newLineSuffix: Boolean): Double = js.native
  def finish(finishedMsg: String, color: Unit, bold: Boolean): Double = js.native
  def finish(finishedMsg: String, color: Unit, bold: Boolean, newLineSuffix: Boolean): Double = js.native
  def finish(finishedMsg: String, color: Unit, bold: Unit, newLineSuffix: Boolean): Double = js.native
}
