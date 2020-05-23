package typings.snykJavaCallGraphBuilder

import typings.glob.mod.IOptions
import typings.node.Buffer
import typings.node.anon.BaseEncodingOptionsflagst
import typings.node.anon.EncodingBufferEncoding
import typings.node.anon.EncodingNull
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/java-call-graph-builder/dist/promisified-fs-glob", JSImport.Namespace)
@js.native
object promisifiedFsGlobMod extends js.Object {
  val exists: js.Function1[/* path */ PathLike, js.Promise[Boolean]] = js.native
  val rename: js.Function2[/* oldPath */ PathLike, /* newPath */ PathLike, js.Promise[Unit]] = js.native
  val unlink: js.Function1[/* path */ PathLike, js.Promise[Unit]] = js.native
  @js.native
  object glob extends js.Object {
    def apply(pattern: String): js.Promise[js.Array[String]] = js.native
    def apply(pattern: String, options: IOptions): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  object mkdir extends js.Object {
    def apply(path: PathLike): js.Promise[js.UndefOr[String]] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[String] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[String]] = js.native
    def apply(path: PathLike, options: Mode): js.Promise[js.UndefOr[String]] = js.native
  }
  
  @js.native
  object readFile extends js.Object {
    def apply(path: Double): js.Promise[String | Buffer] = js.native
    def apply(path: Double, options: String): js.Promise[String | Buffer] = js.native
    def apply(path: Double, options: BaseEncodingOptionsflagst): js.Promise[String | Buffer] = js.native
    def apply(path: Double, options: EncodingBufferEncoding): js.Promise[String] = js.native
    def apply(path: Double, options: EncodingNull): js.Promise[Buffer] = js.native
    def apply(path: PathLike): js.Promise[String | Buffer] = js.native
    def apply(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
    def apply(path: PathLike, options: BaseEncodingOptionsflagst): js.Promise[String | Buffer] = js.native
    def apply(path: PathLike, options: EncodingBufferEncoding): js.Promise[String] = js.native
    def apply(path: PathLike, options: EncodingNull): js.Promise[Buffer] = js.native
  }
  
}

