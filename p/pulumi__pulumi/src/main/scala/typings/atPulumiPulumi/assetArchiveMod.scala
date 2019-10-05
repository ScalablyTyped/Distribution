package typings.atPulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.assetArchiveMod.Archive
import typings.atPulumiPulumi.assetArchiveMod.AssetMap
import typings.atPulumiPulumi.assetAssetMod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/asset/archive", JSImport.Namespace)
@js.native
object assetArchiveMod extends js.Object {
  @js.native
  abstract class Archive () extends js.Object
  
  @js.native
  class AssetArchive protected () extends Archive {
    def this(assets: js.Promise[AssetMap]) = this()
    def this(assets: AssetMap) = this()
    /**
      * A map of names to assets.
      */
    val assets: js.Promise[AssetMap] = js.native
  }
  
  @js.native
  class FileArchive protected () extends Archive {
    def this(path: String) = this()
    def this(path: js.Promise[String]) = this()
    /**
      * The path to the asset file.
      */
    val path: js.Promise[String] = js.native
  }
  
  @js.native
  class RemoteArchive protected () extends Archive {
    def this(uri: String) = this()
    def this(uri: js.Promise[String]) = this()
    /**
      * The URI where the archive lives.
      */
    val uri: js.Promise[String] = js.native
  }
  
  /* static members */
  @js.native
  object Archive extends js.Object {
    /**
      * Returns true if the given object is an instance of an Archive.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/asset/archive.Archive */ Boolean = js.native
  }
  
  type AssetMap = StringDictionary[Asset | Archive]
}

