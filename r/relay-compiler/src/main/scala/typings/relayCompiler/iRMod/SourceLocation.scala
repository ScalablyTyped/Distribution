package typings.relayCompiler.iRMod

import typings.relayCompiler.relayCompilerStrings.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends Location {
  var end: Double
  var kind: Source
  var source: typings.graphql.mod.Source
  var start: Double
}

object SourceLocation {
  @scala.inline
  def apply(end: Double, kind: Source, source: typings.graphql.mod.Source, start: Double): SourceLocation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceLocation]
  }
}

