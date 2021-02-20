package typings.pulumiPulumi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetAssetMod {
  
  @JSImport("@pulumi/pulumi/asset/asset", "Asset")
  @js.native
  abstract class Asset () extends StObject
  /* static members */
  object Asset {
    
    /**
      * Returns true if the given object is an instance of an Asset.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/pulumi/asset/asset", "Asset.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/asset/asset.Asset */ Boolean = js.native
  }
  
  @JSImport("@pulumi/pulumi/asset/asset", "FileAsset")
  @js.native
  class FileAsset protected () extends Asset {
    def this(path: String) = this()
    def this(path: js.Promise[String]) = this()
    
    /**
      * The path to the asset file.
      */
    val path: js.Promise[String] = js.native
  }
  
  @JSImport("@pulumi/pulumi/asset/asset", "RemoteAsset")
  @js.native
  class RemoteAsset protected () extends Asset {
    def this(uri: String) = this()
    def this(uri: js.Promise[String]) = this()
    
    /**
      * The URI where the asset lives.
      */
    val uri: js.Promise[String] = js.native
  }
  
  @JSImport("@pulumi/pulumi/asset/asset", "StringAsset")
  @js.native
  class StringAsset protected () extends Asset {
    def this(text: String) = this()
    def this(text: js.Promise[String]) = this()
    
    /**
      * The string contents.
      */
    val text: js.Promise[String] = js.native
  }
}
