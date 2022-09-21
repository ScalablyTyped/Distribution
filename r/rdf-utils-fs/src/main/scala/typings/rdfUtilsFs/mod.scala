package typings.rdfUtilsFs

import typings.node.fsMod.PathLike
import typings.rdfUtilsFs.fromFileMod.Options
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdf-utils-fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rdf-utils-fs", "fromFile")
  @js.native
  def fromFile: js.Function2[/* filename */ PathLike, /* options */ js.UndefOr[Options], Stream[Quad]] = js.native
  inline def fromFile(filename: PathLike): Stream[Quad] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(filename.asInstanceOf[js.Any]).asInstanceOf[Stream[Quad]]
  inline def fromFile(filename: PathLike, options: Options): Stream[Quad] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Stream[Quad]]
  inline def fromFile_=(x: js.Function2[/* filename */ PathLike, /* options */ js.UndefOr[Options], Stream[Quad]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromFile")(x.asInstanceOf[js.Any])
  
  @JSImport("rdf-utils-fs", "toFile")
  @js.native
  def toFile: js.Function3[
    /* stream */ Stream[Quad], 
    /* filename */ PathLike, 
    /* options */ js.UndefOr[typings.rdfUtilsFs.toFileMod.Options], 
    js.Promise[Unit]
  ] = js.native
  inline def toFile(stream: Stream[Quad], filename: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(stream.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def toFile(stream: Stream[Quad], filename: PathLike, options: typings.rdfUtilsFs.toFileMod.Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(stream.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def toFile_=(
    x: js.Function3[
      /* stream */ Stream[Quad], 
      /* filename */ PathLike, 
      /* options */ js.UndefOr[typings.rdfUtilsFs.toFileMod.Options], 
      js.Promise[Unit]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toFile")(x.asInstanceOf[js.Any])
}
