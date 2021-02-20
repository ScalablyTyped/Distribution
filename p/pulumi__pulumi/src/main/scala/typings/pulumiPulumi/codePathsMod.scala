package typings.pulumiPulumi

import typings.pulumiPulumi.assetMod.Archive
import typings.pulumiPulumi.assetMod.Asset
import typings.pulumiPulumi.resourceMod.Resource
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codePathsMod {
  
  @JSImport("@pulumi/pulumi/runtime/closure/codePaths", "computeCodePaths")
  @js.native
  def computeCodePaths(): js.Promise[Map[String, Asset | Archive]] = js.native
  @JSImport("@pulumi/pulumi/runtime/closure/codePaths", "computeCodePaths")
  @js.native
  def computeCodePaths(
    extraIncludePaths: js.UndefOr[scala.Nothing],
    extraIncludePackages: js.UndefOr[scala.Nothing],
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = js.native
  @JSImport("@pulumi/pulumi/runtime/closure/codePaths", "computeCodePaths")
  @js.native
  def computeCodePaths(extraIncludePaths: js.UndefOr[scala.Nothing], extraIncludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = js.native
  @JSImport("@pulumi/pulumi/runtime/closure/codePaths", "computeCodePaths")
  @js.native
  def computeCodePaths(
    extraIncludePaths: js.UndefOr[scala.Nothing],
    extraIncludePackages: js.Array[String],
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = js.native
  @JSImport("@pulumi/pulumi/runtime/closure/codePaths", "computeCodePaths")
  @js.native
  def computeCodePaths(extraIncludePaths: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = js.native
  @JSImport("@pulumi/pulumi/runtime/closure/codePaths", "computeCodePaths")
  @js.native
  def computeCodePaths(
    extraIncludePaths: js.Array[String],
    extraIncludePackages: js.UndefOr[scala.Nothing],
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = js.native
  @JSImport("@pulumi/pulumi/runtime/closure/codePaths", "computeCodePaths")
  @js.native
  def computeCodePaths(extraIncludePaths: js.Array[String], extraIncludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = js.native
  @JSImport("@pulumi/pulumi/runtime/closure/codePaths", "computeCodePaths")
  @js.native
  def computeCodePaths(
    extraIncludePaths: js.Array[String],
    extraIncludePackages: js.Array[String],
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = js.native
  @JSImport("@pulumi/pulumi/runtime/closure/codePaths", "computeCodePaths")
  @js.native
  def computeCodePaths(options: CodePathOptions): js.Promise[Map[String, Asset | Archive]] = js.native
  
  @js.native
  trait CodePathOptions extends StObject {
    
    /**
      * Packages to explicitly exclude from the Assets for a serialized closure.  This can be used
      * when clients want to trim down the size of a closure, and they know that some package won't
      * ever actually be needed at runtime, but is still a dependency of some package that is being
      * used at runtime.
      */
    var extraExcludePackages: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Extra packages to include when producing the Assets for a serialized closure.  This can be
      * useful if the packages are acquired in a way that the serialization code does not understand.
      * For example, if there was some sort of module that was pulled in based off of a computed
      * string.
      */
    var extraIncludePackages: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Local file/directory paths that we always want to include when producing the Assets to be
      * included for a serialized closure.
      */
    var extraIncludePaths: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The resource to log any errors we encounter against.
      */
    var logResource: js.UndefOr[Resource] = js.native
  }
  object CodePathOptions {
    
    @scala.inline
    def apply(): CodePathOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodePathOptions]
    }
    
    @scala.inline
    implicit class CodePathOptionsMutableBuilder[Self <: CodePathOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraExcludePackages(value: js.Array[String]): Self = StObject.set(x, "extraExcludePackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraExcludePackagesUndefined: Self = StObject.set(x, "extraExcludePackages", js.undefined)
      
      @scala.inline
      def setExtraExcludePackagesVarargs(value: String*): Self = StObject.set(x, "extraExcludePackages", js.Array(value :_*))
      
      @scala.inline
      def setExtraIncludePackages(value: js.Array[String]): Self = StObject.set(x, "extraIncludePackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraIncludePackagesUndefined: Self = StObject.set(x, "extraIncludePackages", js.undefined)
      
      @scala.inline
      def setExtraIncludePackagesVarargs(value: String*): Self = StObject.set(x, "extraIncludePackages", js.Array(value :_*))
      
      @scala.inline
      def setExtraIncludePaths(value: js.Array[String]): Self = StObject.set(x, "extraIncludePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraIncludePathsUndefined: Self = StObject.set(x, "extraIncludePaths", js.undefined)
      
      @scala.inline
      def setExtraIncludePathsVarargs(value: String*): Self = StObject.set(x, "extraIncludePaths", js.Array(value :_*))
      
      @scala.inline
      def setLogResource(value: Resource): Self = StObject.set(x, "logResource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogResourceUndefined: Self = StObject.set(x, "logResource", js.undefined)
    }
  }
}
