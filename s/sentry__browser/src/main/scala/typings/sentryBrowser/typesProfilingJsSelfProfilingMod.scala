package typings.sentryBrowser

import typings.sentryBrowser.anon.Activethreadid
import typings.sentryBrowser.anon.Architecture
import typings.sentryBrowser.anon.Buildnumber
import typings.sentryBrowser.anon.Column
import typings.sentryBrowser.anon.Elapsedsincestartns
import typings.sentryBrowser.anon.Images
import typings.sentryBrowser.anon.Instantiable
import typings.sentryBrowser.anon.Label
import typings.sentryBrowser.anon.MaxBufferSize
import typings.sentryBrowser.anon.Name
import typings.sentryBrowser.anon.Version
import typings.sentryBrowser.sentryBrowserStrings.samplebufferfull
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProfilingJsSelfProfilingMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@sentry/browser/types/profiling/jsSelfProfiling", "JSSelfProfilerConstructor")
  @js.native
  open class JSSelfProfilerConstructor protected ()
    extends StObject
       with JSSelfProfiler {
    def this(options: MaxBufferSize) = this()
    
    /* CompleteClass */
    @JSName("addEventListener")
    override def addEventListener_samplebufferfull(event: samplebufferfull, callback: BufferFullCallback): Unit = js.native
    
    /* CompleteClass */
    var sampleInterval: Double = js.native
    
    /* CompleteClass */
    override def stop(): js.Promise[JSSelfProfile] = js.native
    
    /* CompleteClass */
    var stopped: Boolean = js.native
  }
  
  type BufferFullCallback = js.Function1[/* trace */ JSSelfProfile, Unit]
  
  trait JSSelfProfile extends StObject {
    
    var frames: js.Array[JSSelfProfileFrame]
    
    var resources: js.Array[String]
    
    var samples: js.Array[JSSelfProfileSample]
    
    var stacks: js.Array[JSSelfProfileStack]
  }
  object JSSelfProfile {
    
    inline def apply(
      frames: js.Array[JSSelfProfileFrame],
      resources: js.Array[String],
      samples: js.Array[JSSelfProfileSample],
      stacks: js.Array[JSSelfProfileStack]
    ): JSSelfProfile = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any], stacks = stacks.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSSelfProfile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSSelfProfile] (val x: Self) extends AnyVal {
      
      inline def setFrames(value: js.Array[JSSelfProfileFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesVarargs(value: JSSelfProfileFrame*): Self = StObject.set(x, "frames", js.Array(value*))
      
      inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
      
      inline def setSamples(value: js.Array[JSSelfProfileSample]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSamplesVarargs(value: JSSelfProfileSample*): Self = StObject.set(x, "samples", js.Array(value*))
      
      inline def setStacks(value: js.Array[JSSelfProfileStack]): Self = StObject.set(x, "stacks", value.asInstanceOf[js.Any])
      
      inline def setStacksVarargs(value: JSSelfProfileStack*): Self = StObject.set(x, "stacks", js.Array(value*))
    }
  }
  
  trait JSSelfProfileFrame extends StObject {
    
    var column: js.UndefOr[Double] = js.undefined
    
    var line: js.UndefOr[Double] = js.undefined
    
    var name: String
    
    var resourceId: js.UndefOr[Double] = js.undefined
  }
  object JSSelfProfileFrame {
    
    inline def apply(name: String): JSSelfProfileFrame = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSSelfProfileFrame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSSelfProfileFrame] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResourceId(value: Double): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    }
  }
  
  trait JSSelfProfileSample extends StObject {
    
    var marker: js.UndefOr[JSSelfProfileSampleMarker] = js.undefined
    
    var stackId: js.UndefOr[Double] = js.undefined
    
    var timestamp: Double
  }
  object JSSelfProfileSample {
    
    inline def apply(timestamp: Double): JSSelfProfileSample = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSSelfProfileSample]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSSelfProfileSample] (val x: Self) extends AnyVal {
      
      inline def setMarker(value: JSSelfProfileSampleMarker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      inline def setStackId(value: Double): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
      
      inline def setStackIdUndefined: Self = StObject.set(x, "stackId", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryBrowser.sentryBrowserStrings.script
    - typings.sentryBrowser.sentryBrowserStrings.gc
    - typings.sentryBrowser.sentryBrowserStrings.style
    - typings.sentryBrowser.sentryBrowserStrings.layout
    - typings.sentryBrowser.sentryBrowserStrings.paint
    - typings.sentryBrowser.sentryBrowserStrings.other
  */
  trait JSSelfProfileSampleMarker extends StObject
  object JSSelfProfileSampleMarker {
    
    inline def gc: typings.sentryBrowser.sentryBrowserStrings.gc = "gc".asInstanceOf[typings.sentryBrowser.sentryBrowserStrings.gc]
    
    inline def layout: typings.sentryBrowser.sentryBrowserStrings.layout = "layout".asInstanceOf[typings.sentryBrowser.sentryBrowserStrings.layout]
    
    inline def other: typings.sentryBrowser.sentryBrowserStrings.other = "other".asInstanceOf[typings.sentryBrowser.sentryBrowserStrings.other]
    
    inline def paint: typings.sentryBrowser.sentryBrowserStrings.paint = "paint".asInstanceOf[typings.sentryBrowser.sentryBrowserStrings.paint]
    
    inline def script: typings.sentryBrowser.sentryBrowserStrings.script = "script".asInstanceOf[typings.sentryBrowser.sentryBrowserStrings.script]
    
    inline def style: typings.sentryBrowser.sentryBrowserStrings.style = "style".asInstanceOf[typings.sentryBrowser.sentryBrowserStrings.style]
  }
  
  trait JSSelfProfileStack extends StObject {
    
    var frameId: Double
    
    var parentId: js.UndefOr[Double] = js.undefined
  }
  object JSSelfProfileStack {
    
    inline def apply(frameId: Double): JSSelfProfileStack = {
      val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSSelfProfileStack]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSSelfProfileStack] (val x: Self) extends AnyVal {
      
      inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      inline def setParentId(value: Double): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    }
  }
  
  trait JSSelfProfiler extends StObject {
    
    @JSName("addEventListener")
    def addEventListener_samplebufferfull(event: samplebufferfull, callback: BufferFullCallback): Unit
    
    var sampleInterval: Double
    
    def stop(): js.Promise[JSSelfProfile]
    
    var stopped: Boolean
  }
  object JSSelfProfiler {
    
    inline def apply(
      addEventListener: (samplebufferfull, BufferFullCallback) => Unit,
      sampleInterval: Double,
      stop: () => js.Promise[JSSelfProfile],
      stopped: Boolean
    ): JSSelfProfiler = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), sampleInterval = sampleInterval.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSSelfProfiler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSSelfProfiler] (val x: Self) extends AnyVal {
      
      inline def setAddEventListener(value: (samplebufferfull, BufferFullCallback) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      inline def setSampleInterval(value: Double): Self = StObject.set(x, "sampleInterval", value.asInstanceOf[js.Any])
      
      inline def setStop(value: () => js.Promise[JSSelfProfile]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProcessedJSSelfProfile
    extends StObject
       with JSSelfProfile {
    
    var profile_id: String
  }
  object ProcessedJSSelfProfile {
    
    inline def apply(
      frames: js.Array[JSSelfProfileFrame],
      profile_id: String,
      resources: js.Array[String],
      samples: js.Array[JSSelfProfileSample],
      stacks: js.Array[JSSelfProfileStack]
    ): ProcessedJSSelfProfile = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], profile_id = profile_id.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any], stacks = stacks.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessedJSSelfProfile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProcessedJSSelfProfile] (val x: Self) extends AnyVal {
      
      inline def setProfile_id(value: String): Self = StObject.set(x, "profile_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait RawThreadCpuProfile
    extends StObject
       with JSSelfProfile {
    
    var profile_id: String
  }
  object RawThreadCpuProfile {
    
    inline def apply(
      frames: js.Array[JSSelfProfileFrame],
      profile_id: String,
      resources: js.Array[String],
      samples: js.Array[JSSelfProfileSample],
      stacks: js.Array[JSSelfProfileStack]
    ): RawThreadCpuProfile = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], profile_id = profile_id.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any], stacks = stacks.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawThreadCpuProfile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawThreadCpuProfile] (val x: Self) extends AnyVal {
      
      inline def setProfile_id(value: String): Self = StObject.set(x, "profile_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait SentryProfile extends StObject {
    
    var debug_meta: js.UndefOr[Images] = js.undefined
    
    var device: Architecture
    
    var environment: String
    
    var event_id: String
    
    var os: Buildnumber
    
    var platform: String
    
    var profile: ThreadCpuProfile
    
    var release: String
    
    var runtime: Version
    
    var timestamp: String
    
    var transactions: js.Array[Activethreadid]
    
    var version: String
  }
  object SentryProfile {
    
    inline def apply(
      device: Architecture,
      environment: String,
      event_id: String,
      os: Buildnumber,
      platform: String,
      profile: ThreadCpuProfile,
      release: String,
      runtime: Version,
      timestamp: String,
      transactions: js.Array[Activethreadid],
      version: String
    ): SentryProfile = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], event_id = event_id.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentryProfile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SentryProfile] (val x: Self) extends AnyVal {
      
      inline def setDebug_meta(value: Images): Self = StObject.set(x, "debug_meta", value.asInstanceOf[js.Any])
      
      inline def setDebug_metaUndefined: Self = StObject.set(x, "debug_meta", js.undefined)
      
      inline def setDevice(value: Architecture): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEvent_id(value: String): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
      
      inline def setOs(value: Buildnumber): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: ThreadCpuProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: Version): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTransactions(value: js.Array[Activethreadid]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      inline def setTransactionsVarargs(value: Activethreadid*): Self = StObject.set(x, "transactions", js.Array(value*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThreadCpuProfile extends StObject {
    
    var frames: js.Array[Column]
    
    var queue_metadata: js.UndefOr[Record[String, Label]] = js.undefined
    
    var samples: js.Array[Elapsedsincestartns]
    
    var stacks: js.Array[js.Array[Double]]
    
    var thread_metadata: Record[String, Name]
  }
  object ThreadCpuProfile {
    
    inline def apply(
      frames: js.Array[Column],
      samples: js.Array[Elapsedsincestartns],
      stacks: js.Array[js.Array[Double]],
      thread_metadata: Record[String, Name]
    ): ThreadCpuProfile = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any], stacks = stacks.asInstanceOf[js.Any], thread_metadata = thread_metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThreadCpuProfile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThreadCpuProfile] (val x: Self) extends AnyVal {
      
      inline def setFrames(value: js.Array[Column]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesVarargs(value: Column*): Self = StObject.set(x, "frames", js.Array(value*))
      
      inline def setQueue_metadata(value: Record[String, Label]): Self = StObject.set(x, "queue_metadata", value.asInstanceOf[js.Any])
      
      inline def setQueue_metadataUndefined: Self = StObject.set(x, "queue_metadata", js.undefined)
      
      inline def setSamples(value: js.Array[Elapsedsincestartns]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSamplesVarargs(value: Elapsedsincestartns*): Self = StObject.set(x, "samples", js.Array(value*))
      
      inline def setStacks(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "stacks", value.asInstanceOf[js.Any])
      
      inline def setStacksVarargs(value: js.Array[Double]*): Self = StObject.set(x, "stacks", js.Array(value*))
      
      inline def setThread_metadata(value: Record[String, Name]): Self = StObject.set(x, "thread_metadata", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      var Profiler: js.UndefOr[Instantiable] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setProfiler(value: Instantiable): Self = StObject.set(x, "Profiler", value.asInstanceOf[js.Any])
        
        inline def setProfilerUndefined: Self = StObject.set(x, "Profiler", js.undefined)
      }
    }
  }
}
