package typings.standardEngine

import org.scalablytyped.runtime.Instantiable2
import typings.eslint.mod.AST.Program
import typings.eslint.mod.SourceCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSourceCode extends Instantiable2[/* text */ String, /* ast */ Program, SourceCode] {
  def splitLines(text: String): js.Array[String] = js.native
}

