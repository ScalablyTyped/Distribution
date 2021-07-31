package typings.shelljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeadFunction extends StObject {
  
  def apply(files: String*): ShellString = js.native
  def apply(files: js.Array[String]): ShellString = js.native
  def apply(options: HeadOptions, files: String*): ShellString = js.native
  def apply(options: HeadOptions, files: js.Array[String]): ShellString = js.native
}
