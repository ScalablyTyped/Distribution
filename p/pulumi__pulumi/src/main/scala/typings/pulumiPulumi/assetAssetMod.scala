package typings.pulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/asset/asset", JSImport.Namespace)
@js.native
object assetAssetMod extends js.Object {
  @js.native
  abstract class Asset () extends js.Object
  
  @js.native
  class FileAsset protected () extends Asset {
    def this(path: String) = this()
    def this(path: js.Promise[String]) = this()
    /**
      * The path to the asset file.
      */
    val path: js.Promise[String] = js.native
  }
  
  @js.native
  class RemoteAsset protected () extends Asset {
    def this(uri: String) = this()
    def this(uri: js.Promise[String]) = this()
    /**
      * The URI where the asset lives.
      */
    val uri: js.Promise[String] = js.native
  }
  
  @js.native
  class StringAsset protected () extends Asset {
    def this(text: String) = this()
    def this(text: js.Promise[String]) = this()
    /**
      * The string contents.
      */
    val text: js.Promise[String] = js.native
  }
  
  /* static members */
  @js.native
  object Asset extends js.Object {
    /**
      * Returns true if the given object is an instance of an Asset.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/asset/asset.Asset */ Boolean = js.native
  }
  
}

