package typings.snykDockerPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object extractorTypesMod {
  type ExtractCallback = js.Function1[
    /* dataStream */ typings.node.streamMod.Readable, 
    js.Promise[java.lang.String | typings.node.Buffer]
  ]
  type ExtractedLayers = org.scalablytyped.runtime.StringDictionary[typings.snykDockerPlugin.extractorTypesMod.FileNameAndContent]
  type FileNameAndContent = typings.std.Record[java.lang.String, java.lang.String | typings.node.Buffer]
}
