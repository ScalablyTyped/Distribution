package typings.sentryInternalTracing

import typings.sentryInternalTracing.typesNodeIntegrationsLazyMod.LazyLoadedIntegration
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesHubMod.Hub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNodeIntegrationsMongoMod {
  
  @JSImport("@sentry-internal/tracing/types/node/integrations/mongo", "Mongo")
  @js.native
  /**
    * @inheritDoc
    */
  open class Mongo ()
    extends StObject
       with LazyLoadedIntegration[MongoModule] {
    def this(options: MongoOptions) = this()
    
    /* private */ var _describeOperations: Any = js.native
    
    /**
      * Form a SpanContext based on the user input to a given operation.
      */
    /* private */ var _getSpanContextFromOperationArguments: Any = js.native
    
    /**
      * Patches original collection methods
      */
    /* private */ var _instrumentOperations: Any = js.native
    
    /* private */ var _module: Any = js.native
    
    /* private */ var _operations: Any = js.native
    
    /**
      * Patches original collection to utilize our tracing functionality
      */
    /* private */ var _patchOperation: Any = js.native
    
    /* private */ var _useMongoose: Any = js.native
    
    /**
      * Loads the integration's dependency and caches it so it doesn't have to be loaded again.
      *
      * If this returns undefined, the dependency could not be loaded.
      */
    /* CompleteClass */
    override def loadDependency(): js.UndefOr[MongoModule] = js.native
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Sets the integration up only once.
      * This takes no options on purpose, options should be passed in the constructor
      */
    /* CompleteClass */
    override def setupOnce(
      addGlobalEventProcessor: js.Function1[/* callback */ EventProcessor, Unit],
      getCurrentHub: js.Function0[Hub]
    ): Unit = js.native
  }
  /* static members */
  object Mongo {
    
    @JSImport("@sentry-internal/tracing/types/node/integrations/mongo", "Mongo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing/types/node/integrations/mongo", "Mongo.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  trait MongoCollection extends StObject {
    
    var collectionName: String
    
    var dbName: String
    
    var namespace: String
  }
  object MongoCollection {
    
    inline def apply(collectionName: String, dbName: String, namespace: String): MongoCollection = {
      val __obj = js.Dynamic.literal(collectionName = collectionName.asInstanceOf[js.Any], dbName = dbName.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[MongoCollection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MongoCollection] (val x: Self) extends AnyVal {
      
      inline def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
      
      inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  trait MongoModule extends StObject {
    
    var Collection: MongoCollection
  }
  object MongoModule {
    
    inline def apply(Collection: MongoCollection): MongoModule = {
      val __obj = js.Dynamic.literal(Collection = Collection.asInstanceOf[js.Any])
      __obj.asInstanceOf[MongoModule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MongoModule] (val x: Self) extends AnyVal {
      
      inline def setCollection(value: MongoCollection): Self = StObject.set(x, "Collection", value.asInstanceOf[js.Any])
    }
  }
  
  trait MongoOptions extends StObject {
    
    var describeOperations: js.UndefOr[Boolean | js.Array[Operation]] = js.undefined
    
    var operations: js.UndefOr[js.Array[Operation]] = js.undefined
    
    var useMongoose: js.UndefOr[Boolean] = js.undefined
  }
  object MongoOptions {
    
    inline def apply(): MongoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MongoOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MongoOptions] (val x: Self) extends AnyVal {
      
      inline def setDescribeOperations(value: Boolean | js.Array[Operation]): Self = StObject.set(x, "describeOperations", value.asInstanceOf[js.Any])
      
      inline def setDescribeOperationsUndefined: Self = StObject.set(x, "describeOperations", js.undefined)
      
      inline def setDescribeOperationsVarargs(value: Operation*): Self = StObject.set(x, "describeOperations", js.Array(value*))
      
      inline def setOperations(value: js.Array[Operation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
      
      inline def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value*))
      
      inline def setUseMongoose(value: Boolean): Self = StObject.set(x, "useMongoose", value.asInstanceOf[js.Any])
      
      inline def setUseMongooseUndefined: Self = StObject.set(x, "useMongoose", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryInternalTracing.sentryInternalTracingStrings.aggregate
    - typings.sentryInternalTracing.sentryInternalTracingStrings.bulkWrite
    - typings.sentryInternalTracing.sentryInternalTracingStrings.countDocuments
    - typings.sentryInternalTracing.sentryInternalTracingStrings.createIndex
    - typings.sentryInternalTracing.sentryInternalTracingStrings.createIndexes
    - typings.sentryInternalTracing.sentryInternalTracingStrings.deleteMany
    - typings.sentryInternalTracing.sentryInternalTracingStrings.deleteOne
    - typings.sentryInternalTracing.sentryInternalTracingStrings.distinct
    - typings.sentryInternalTracing.sentryInternalTracingStrings.drop
    - typings.sentryInternalTracing.sentryInternalTracingStrings.dropIndex
    - typings.sentryInternalTracing.sentryInternalTracingStrings.dropIndexes
    - typings.sentryInternalTracing.sentryInternalTracingStrings.estimatedDocumentCount
    - typings.sentryInternalTracing.sentryInternalTracingStrings.find
    - typings.sentryInternalTracing.sentryInternalTracingStrings.findOne
    - typings.sentryInternalTracing.sentryInternalTracingStrings.findOneAndDelete
    - typings.sentryInternalTracing.sentryInternalTracingStrings.findOneAndReplace
    - typings.sentryInternalTracing.sentryInternalTracingStrings.findOneAndUpdate
    - typings.sentryInternalTracing.sentryInternalTracingStrings.indexes
    - typings.sentryInternalTracing.sentryInternalTracingStrings.indexExists
    - typings.sentryInternalTracing.sentryInternalTracingStrings.indexInformation
    - typings.sentryInternalTracing.sentryInternalTracingStrings.initializeOrderedBulkOp
    - typings.sentryInternalTracing.sentryInternalTracingStrings.insertMany
    - typings.sentryInternalTracing.sentryInternalTracingStrings.insertOne
    - typings.sentryInternalTracing.sentryInternalTracingStrings.isCapped
    - typings.sentryInternalTracing.sentryInternalTracingStrings.mapReduce
    - typings.sentryInternalTracing.sentryInternalTracingStrings.options
    - typings.sentryInternalTracing.sentryInternalTracingStrings.parallelCollectionScan
    - typings.sentryInternalTracing.sentryInternalTracingStrings.rename
    - typings.sentryInternalTracing.sentryInternalTracingStrings.replaceOne
    - typings.sentryInternalTracing.sentryInternalTracingStrings.stats
    - typings.sentryInternalTracing.sentryInternalTracingStrings.updateMany
    - typings.sentryInternalTracing.sentryInternalTracingStrings.updateOne
  */
  trait Operation extends StObject
}
