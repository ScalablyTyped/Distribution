package typings.sourceMap.mod

import typings.sourceMap.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicSourceMapConsumer
  extends StObject
     with SourceMapConsumer {
  
  var file: String = js.native
  
  var sourceRoot: String = js.native
  
  var sources: js.Array[String] = js.native
  
  var sourcesContent: js.Array[String] = js.native
}
object BasicSourceMapConsumer {
  
  @scala.inline
  def apply: BasicSourceMapConsumerConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("BasicSourceMapConsumer").asInstanceOf[BasicSourceMapConsumerConstructor]
}
