package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.relayDashCompiler.relayDashCompilerStrings.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends Location {
  var end: Double
  var kind: Source
  var source: typings.graphql.graphqlMod.Source
  var start: Double
}

object SourceLocation {
  @scala.inline
  def apply(end: Double, kind: Source, source: typings.graphql.graphqlMod.Source, start: Double): SourceLocation = {
    val __obj = js.Dynamic.literal(end = end, kind = kind, source = source, start = start)
  
    __obj.asInstanceOf[SourceLocation]
  }
}

