package typings.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.assetAssetMod.Asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object archiveMod {
  
  @JSImport("@pulumi/pulumi/asset/archive", "Archive")
  @js.native
  abstract class Archive () extends StObject
  /* static members */
  object Archive {
    
    @JSImport("@pulumi/pulumi/asset/archive", "Archive")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns true if the given object is an instance of an Archive.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/asset/archive.Archive */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/asset/archive.Archive */ Boolean]
  }
  
  @JSImport("@pulumi/pulumi/asset/archive", "AssetArchive")
  @js.native
  class AssetArchive protected () extends Archive {
    def this(assets: js.Promise[AssetMap]) = this()
    def this(assets: AssetMap) = this()
    
    /**
      * A map of names to assets.
      */
    val assets: js.Promise[AssetMap] = js.native
  }
  
  @JSImport("@pulumi/pulumi/asset/archive", "FileArchive")
  @js.native
  class FileArchive protected () extends Archive {
    def this(path: String) = this()
    def this(path: js.Promise[String]) = this()
    
    /**
      * The path to the asset file.
      */
    val path: js.Promise[String] = js.native
  }
  
  @JSImport("@pulumi/pulumi/asset/archive", "RemoteArchive")
  @js.native
  class RemoteArchive protected () extends Archive {
    def this(uri: String) = this()
    def this(uri: js.Promise[String]) = this()
    
    /**
      * The URI where the archive lives.
      */
    val uri: js.Promise[String] = js.native
  }
  
  type AssetMap = StringDictionary[Asset | Archive]
}
