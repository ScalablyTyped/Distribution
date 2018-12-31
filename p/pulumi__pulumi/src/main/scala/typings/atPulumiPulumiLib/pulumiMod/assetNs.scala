package typings
package atPulumiPulumiLib.pulumiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "asset")
@js.native
object assetNs extends js.Object {
  @js.native
  abstract class Archive ()
    extends atPulumiPulumiLib.assetMod.Archive
  
  @js.native
  abstract class Asset ()
    extends atPulumiPulumiLib.assetMod.Asset
  
  @js.native
  class AssetArchive protected ()
    extends atPulumiPulumiLib.assetMod.AssetArchive {
    def this(assets: atPulumiPulumiLib.assetArchiveMod.AssetMap) = this()
    def this(assets: js.Promise[atPulumiPulumiLib.assetArchiveMod.AssetMap]) = this()
  }
  
  @js.native
  class FileArchive protected ()
    extends atPulumiPulumiLib.assetMod.FileArchive {
    def this(path: java.lang.String) = this()
    def this(path: js.Promise[java.lang.String]) = this()
  }
  
  @js.native
  class FileAsset protected ()
    extends atPulumiPulumiLib.assetMod.FileAsset {
    def this(path: java.lang.String) = this()
    def this(path: js.Promise[java.lang.String]) = this()
  }
  
  @js.native
  class RemoteArchive protected ()
    extends atPulumiPulumiLib.assetMod.RemoteArchive {
    def this(uri: java.lang.String) = this()
    def this(uri: js.Promise[java.lang.String]) = this()
  }
  
  @js.native
  class RemoteAsset protected ()
    extends atPulumiPulumiLib.assetMod.RemoteAsset {
    def this(uri: java.lang.String) = this()
    def this(uri: js.Promise[java.lang.String]) = this()
  }
  
  @js.native
  class StringAsset protected ()
    extends atPulumiPulumiLib.assetMod.StringAsset {
    def this(text: java.lang.String) = this()
    def this(text: js.Promise[java.lang.String]) = this()
  }
  
  @js.native
  object Archive extends js.Object {
    /**
      * Returns true if the given object is an instance of an Archive.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/asset/archive.Archive */ scala.Boolean = js.native
  }
  
  @js.native
  object Asset extends js.Object {
    /**
      * Returns true if the given object is an instance of an Asset.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/asset/asset.Asset */ scala.Boolean = js.native
  }
  
}

