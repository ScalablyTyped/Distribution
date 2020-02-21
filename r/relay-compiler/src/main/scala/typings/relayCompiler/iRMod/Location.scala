package typings.relayCompiler.iRMod

import typings.relayCompiler.relayCompilerStrings.Derived
import typings.relayCompiler.relayCompilerStrings.Generated
import typings.relayCompiler.relayCompilerStrings.Source
import typings.relayCompiler.relayCompilerStrings.Unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayCompiler.iRMod.SourceLocation
  - typings.relayCompiler.iRMod.GeneratedLocation
  - typings.relayCompiler.iRMod.DerivedLocation
  - typings.relayCompiler.iRMod.UnknownLocation
*/
trait Location extends js.Object

object Location {
  @scala.inline
  def SourceLocation(end: Double, kind: Source, source: typings.graphql.mod.Source, start: Double): Location = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  def GeneratedLocation(kind: Generated): Location = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  def DerivedLocation(kind: Derived, source: Location): Location = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  def UnknownLocation(kind: Unknown): Location = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Location]
  }
}

