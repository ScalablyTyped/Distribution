package typings.pulumiCloud

import typings.pulumiCloud.apiMod.API
import typings.pulumiCloud.apiMod.APIConstructor
import typings.pulumiCloud.bucketMod.Bucket
import typings.pulumiCloud.bucketMod.BucketConstructor
import typings.pulumiCloud.httpServerMod.HttpServer
import typings.pulumiCloud.httpServerMod.HttpServerConstructor
import typings.pulumiCloud.httpServerMod.RequestListenerFactory
import typings.pulumiCloud.serviceMod.Container
import typings.pulumiCloud.serviceMod.HostPathVolume
import typings.pulumiCloud.serviceMod.HostPathVolumeConstructor
import typings.pulumiCloud.serviceMod.Service
import typings.pulumiCloud.serviceMod.ServiceArguments
import typings.pulumiCloud.serviceMod.ServiceConstructor
import typings.pulumiCloud.serviceMod.SharedVolume
import typings.pulumiCloud.serviceMod.SharedVolumeConstructor
import typings.pulumiCloud.serviceMod.Task
import typings.pulumiCloud.serviceMod.TaskConstructor
import typings.pulumiCloud.tableMod.PrimaryKeyType
import typings.pulumiCloud.tableMod.Table
import typings.pulumiCloud.tableMod.TableConstructor
import typings.pulumiCloud.timerMod.Action
import typings.pulumiCloud.timerMod.DailySchedule
import typings.pulumiCloud.timerMod.HourlySchedule
import typings.pulumiCloud.timerMod.IntervalRate
import typings.pulumiCloud.topicMod.Topic
import typings.pulumiCloud.topicMod.TopicConstructor
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pulumi/cloud", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/cloud", "API")
  @js.native
  def API: APIConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "API")
  @js.native
  class APICls protected () extends API {
    def this(apiName: String) = this()
  }
  
  @scala.inline
  def API_=(x: APIConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("API")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud", "Bucket")
  @js.native
  def Bucket: BucketConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "Bucket")
  @js.native
  class BucketCls protected () extends Bucket {
    /**
      * Creates a new Bucket.
      *
      * @param name A unique name for the bucket.
      * @param opts A bag of options that controls how this resource behaves.
      */
    def this(name: String) = this()
    def this(name: String, opts: ResourceOptions) = this()
  }
  
  @scala.inline
  def Bucket_=(x: BucketConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud", "HostPathVolume")
  @js.native
  def HostPathVolume: HostPathVolumeConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "HostPathVolume")
  @js.native
  class HostPathVolumeCls protected () extends HostPathVolume {
    /**
      * Construct a new Volume with the given unique name.
      */
    def this(path: String) = this()
  }
  
  @scala.inline
  def HostPathVolume_=(x: HostPathVolumeConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HostPathVolume")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud", "HttpEndpoint")
  @js.native
  def HttpEndpoint: APIConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "HttpEndpoint")
  @js.native
  class HttpEndpointCls protected () extends API {
    def this(apiName: String) = this()
  }
  
  @scala.inline
  def HttpEndpoint_=(x: APIConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HttpEndpoint")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud", "HttpServer")
  @js.native
  def HttpServer: HttpServerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "HttpServer")
  @js.native
  class HttpServerCls protected () extends HttpServer {
    /**
      * @param createRequestListener Function that, when called, will produce the [[requestListener]]
      * function that will be called for each http request to the server.  The function will be
      * called once when the module is loaded.  As such, it is a suitable place for expensive
      * computation (like setting up a set of routes).  The function returned can then utilize the
      * results of that computation.
      */
    def this(name: String, createRequestListener: RequestListenerFactory) = this()
    def this(name: String, createRequestListener: RequestListenerFactory, opts: ResourceOptions) = this()
  }
  
  @scala.inline
  def HttpServer_=(x: HttpServerConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HttpServer")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud", "Service")
  @js.native
  def Service: ServiceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "Service")
  @js.native
  class ServiceCls protected () extends Service {
    /**
      * Construct a new Service, which is one or more managed replicas of a group of one or more Containers.
      *
      * @param name The unique name of the service.
      * @param opts A bag of options that controls how this resource behaves.
      */
    def this(name: String, args: ServiceArguments) = this()
    def this(name: String, args: ServiceArguments, opts: ResourceOptions) = this()
  }
  
  @scala.inline
  def Service_=(x: ServiceConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Service")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud", "SharedVolume")
  @js.native
  def SharedVolume: SharedVolumeConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "SharedVolume")
  @js.native
  class SharedVolumeCls protected () extends SharedVolume {
    /**
      * Construct a new Volume with the given unique name.
      *
      * @param name The unique name of the volume.
      * @param opts A bag of options that controls how this resource behaves.
      */
    def this(name: String) = this()
    def this(name: String, opts: ResourceOptions) = this()
  }
  
  @scala.inline
  def SharedVolume_=(x: SharedVolumeConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SharedVolume")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud", "Table")
  @js.native
  def Table: TableConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "Table")
  @js.native
  class TableCls protected () extends Table {
    /**
      * Creates a new Table.
      *
      * @param name A unique name for the table.
      * @param primaryKey An optional primary key name.
      * @param primaryKeyType An optional primary key type.
      * @param opts A bag of options that controls how this resource behaves.
      */
    def this(name: String) = this()
    def this(name: String, primaryKey: Input[String]) = this()
    def this(name: String, primaryKey: js.UndefOr[Input[String]], primaryKeyType: Input[PrimaryKeyType]) = this()
    def this(
      name: String,
      primaryKey: js.UndefOr[Input[String]],
      primaryKeyType: js.UndefOr[Input[PrimaryKeyType]],
      opts: ResourceOptions
    ) = this()
  }
  
  @scala.inline
  def Table_=(x: TableConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Table")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud", "Task")
  @js.native
  def Task: TaskConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "Task")
  @js.native
  class TaskCls protected () extends Task {
    /**
      * Construct a new Task, which is a Container that can be run many times as individual tasks.
      *
      * @param name The unique name of the task.
      * @param container The container specification.
      * @param opts A bag of options that controls how this resource behaves.
      */
    def this(name: String, container: Container) = this()
    def this(name: String, container: Container, opts: ResourceOptions) = this()
  }
  
  @scala.inline
  def Task_=(x: TaskConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Task")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud", "Topic")
  @js.native
  def Topic: TopicConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "Topic")
  @js.native
  class TopicCls[T] protected () extends Topic[T] {
    /**
      * Allocate a new Topic with a given name.
      *
      * @param name The unique name of the Topic.
      * @param opts A bag of options that controls how this resource behaves.
      */
    def this(name: String) = this()
    def this(name: String, opts: ResourceOptions) = this()
  }
  
  @scala.inline
  def Topic_=(x: TopicConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Topic")(x.asInstanceOf[js.Any])
  
  object timer {
    
    @JSImport("@pulumi/cloud", "timer.cron")
    @js.native
    def cron(name: String, cronTab: String, handler: Action): Unit = js.native
    @JSImport("@pulumi/cloud", "timer.cron")
    @js.native
    def cron(name: String, cronTab: String, handler: Action, opts: ResourceOptions): Unit = js.native
    
    @JSImport("@pulumi/cloud", "timer.daily")
    @js.native
    def daily(name: String, handler: Action): Unit = js.native
    @JSImport("@pulumi/cloud", "timer.daily")
    @js.native
    def daily(name: String, handler: Action, opts: ResourceOptions): Unit = js.native
    @JSImport("@pulumi/cloud", "timer.daily")
    @js.native
    def daily(name: String, schedule: DailySchedule, handler: Action): Unit = js.native
    @JSImport("@pulumi/cloud", "timer.daily")
    @js.native
    def daily(name: String, schedule: DailySchedule, handler: Action, opts: ResourceOptions): Unit = js.native
    
    @JSImport("@pulumi/cloud", "timer.hourly")
    @js.native
    def hourly(name: String, handler: Action): Unit = js.native
    @JSImport("@pulumi/cloud", "timer.hourly")
    @js.native
    def hourly(name: String, handler: Action, opts: ResourceOptions): Unit = js.native
    @JSImport("@pulumi/cloud", "timer.hourly")
    @js.native
    def hourly(name: String, schedule: HourlySchedule, handler: Action): Unit = js.native
    @JSImport("@pulumi/cloud", "timer.hourly")
    @js.native
    def hourly(name: String, schedule: HourlySchedule, handler: Action, opts: ResourceOptions): Unit = js.native
    
    @JSImport("@pulumi/cloud", "timer.interval")
    @js.native
    def interval(name: String, options: IntervalRate, handler: Action): Unit = js.native
    @JSImport("@pulumi/cloud", "timer.interval")
    @js.native
    def interval(name: String, options: IntervalRate, handler: Action, opts: ResourceOptions): Unit = js.native
  }
}
