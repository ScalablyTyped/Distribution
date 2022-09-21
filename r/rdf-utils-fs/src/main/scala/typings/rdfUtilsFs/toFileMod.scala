package typings.rdfUtilsFs

import typings.node.fsMod.PathLike
import typings.rdfUtilsFs.anon.Extensions
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.streamMod.Stream
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toFileMod {
  
  inline def apply(stream: Stream[Quad], filename: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(stream: Stream[Quad], filename: PathLike, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("rdf-utils-fs/toFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Options = (Record[String, Any]) & Extensions
}
