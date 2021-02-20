package typings.pulumiPulumi

import typings.pulumiPulumi.resourceMod.ComponentResource
import typings.pulumiPulumi.resourceMod.URN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  @JSImport("@pulumi/pulumi/runtime/settings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "disconnect")
  @js.native
  def disconnect(): js.Promise[Unit] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "disconnectSync")
  @js.native
  def disconnectSync(): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "excessiveDebugOutput")
  @js.native
  def excessiveDebugOutput: Boolean = js.native
  @scala.inline
  def excessiveDebugOutput_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excessiveDebugOutput")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/pulumi/runtime/settings", "getEngine")
  @js.native
  def getEngine(): js.UndefOr[js.Object] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "getMonitor")
  @js.native
  def getMonitor(): js.UndefOr[js.Object] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "getProject")
  @js.native
  def getProject(): String = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "getRootResource")
  @js.native
  def getRootResource(): js.Promise[js.UndefOr[URN]] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "getStack")
  @js.native
  def getStack(): String = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "hasEngine")
  @js.native
  def hasEngine(): Boolean = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "hasMonitor")
  @js.native
  def hasMonitor(): Boolean = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "isDryRun")
  @js.native
  def isDryRun(): Boolean = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "isLegacyApplyEnabled")
  @js.native
  def isLegacyApplyEnabled(): Boolean = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "isQueryMode")
  @js.native
  def isQueryMode(): Boolean = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "isTestModeEnabled")
  @js.native
  def isTestModeEnabled(): Boolean = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "maxRPCMessageSize")
  @js.native
  val maxRPCMessageSize: Double = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "monitorSupportsFeature")
  @js.native
  def monitorSupportsFeature(feature: String): js.Promise[Boolean] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "monitorSupportsResourceReferences")
  @js.native
  def monitorSupportsResourceReferences(): js.Promise[Boolean] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "monitorSupportsSecrets")
  @js.native
  def monitorSupportsSecrets(): js.Promise[Boolean] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "resetOptions")
  @js.native
  def resetOptions(
    project: String,
    stack: String,
    parallel: Double,
    engineAddr: String,
    monitorAddr: String,
    preview: Boolean
  ): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "rpcKeepAlive")
  @js.native
  def rpcKeepAlive(): js.Function0[Unit] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "serialize")
  @js.native
  def serialize(): Boolean = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "setMockOptions")
  @js.native
  def setMockOptions(mockMonitor: js.Any): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime/settings", "setMockOptions")
  @js.native
  def setMockOptions(
    mockMonitor: js.Any,
    project: js.UndefOr[scala.Nothing],
    stack: js.UndefOr[scala.Nothing],
    preview: Boolean
  ): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime/settings", "setMockOptions")
  @js.native
  def setMockOptions(mockMonitor: js.Any, project: js.UndefOr[scala.Nothing], stack: String): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime/settings", "setMockOptions")
  @js.native
  def setMockOptions(mockMonitor: js.Any, project: js.UndefOr[scala.Nothing], stack: String, preview: Boolean): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime/settings", "setMockOptions")
  @js.native
  def setMockOptions(mockMonitor: js.Any, project: String): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime/settings", "setMockOptions")
  @js.native
  def setMockOptions(mockMonitor: js.Any, project: String, stack: js.UndefOr[scala.Nothing], preview: Boolean): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime/settings", "setMockOptions")
  @js.native
  def setMockOptions(mockMonitor: js.Any, project: String, stack: String): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime/settings", "setMockOptions")
  @js.native
  def setMockOptions(mockMonitor: js.Any, project: String, stack: String, preview: Boolean): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "setRootResource")
  @js.native
  def setRootResource(res: ComponentResource[_]): js.Promise[Unit] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/settings", "terminateRpcs")
  @js.native
  def terminateRpcs(): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    val dryRun: js.UndefOr[Boolean] = js.native
    
    val engineAddr: js.UndefOr[String] = js.native
    
    val legacyApply: js.UndefOr[Boolean] = js.native
    
    val monitorAddr: js.UndefOr[String] = js.native
    
    val parallel: js.UndefOr[Double] = js.native
    
    val project: js.UndefOr[String] = js.native
    
    val queryMode: js.UndefOr[Boolean] = js.native
    
    val stack: js.UndefOr[String] = js.native
    
    /**
      * Directory containing the send/receive files for making synchronous invokes to the engine.
      */
    val syncDir: js.UndefOr[String] = js.native
    
    val testModeEnabled: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      @scala.inline
      def setEngineAddr(value: String): Self = StObject.set(x, "engineAddr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineAddrUndefined: Self = StObject.set(x, "engineAddr", js.undefined)
      
      @scala.inline
      def setLegacyApply(value: Boolean): Self = StObject.set(x, "legacyApply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegacyApplyUndefined: Self = StObject.set(x, "legacyApply", js.undefined)
      
      @scala.inline
      def setMonitorAddr(value: String): Self = StObject.set(x, "monitorAddr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitorAddrUndefined: Self = StObject.set(x, "monitorAddr", js.undefined)
      
      @scala.inline
      def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      @scala.inline
      def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setQueryMode(value: Boolean): Self = StObject.set(x, "queryMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryModeUndefined: Self = StObject.set(x, "queryMode", js.undefined)
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      @scala.inline
      def setSyncDir(value: String): Self = StObject.set(x, "syncDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncDirUndefined: Self = StObject.set(x, "syncDir", js.undefined)
      
      @scala.inline
      def setTestModeEnabled(value: Boolean): Self = StObject.set(x, "testModeEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestModeEnabledUndefined: Self = StObject.set(x, "testModeEnabled", js.undefined)
    }
  }
}
