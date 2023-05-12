package typings.sigstore

import typings.sigstore.distTlogTypesMod.Entry
import typings.sigstore.distTlogTypesMod.EntryKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExternalRekorMod {
  
  @JSImport("sigstore/dist/external/rekor", "Rekor")
  @js.native
  open class Rekor protected () extends StObject {
    def this(options: RekorOptions) = this()
    
    /* private */ var baseUrl: Any = js.native
    
    /**
      * Create a new entry in the Rekor log.
      * @param propsedEntry {EntryKind} Data to create a new entry
      * @returns {Promise<Entry>} The created entry
      */
    def createEntry(propsedEntry: EntryKind): js.Promise[Entry] = js.native
    
    /* private */ var fetch: Any = js.native
    
    /**
      * Get an entry from the Rekor log.
      * @param uuid {string} The UUID of the entry to retrieve
      * @returns {Promise<Entry>} The retrieved entry
      */
    def getEntry(uuid: String): js.Promise[Entry] = js.native
    
    /**
      * Search the Rekor log index for entries matching the given query.
      * @param opts {SearchIndex} Options to search the Rekor log
      * @returns {Promise<string[]>} UUIDs of matching entries
      */
    def searchIndex(opts: SearchIndex): js.Promise[js.Array[String]] = js.native
    
    /**
      * Search the Rekor logs for matching the given query.
      * @param opts {SearchLogQuery} Query to search the Rekor log
      * @returns {Promise<Entry[]>} List of matching entries
      */
    def searchLog(opts: SearchLogQuery): js.Promise[js.Array[Entry]] = js.native
  }
  
  trait RekorOptions extends StObject {
    
    var baseURL: String
  }
  object RekorOptions {
    
    inline def apply(baseURL: String): RekorOptions = {
      val __obj = js.Dynamic.literal(baseURL = baseURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[RekorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RekorOptions] (val x: Self) extends AnyVal {
      
      inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchIndex extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var hash: js.UndefOr[String] = js.undefined
  }
  object SearchIndex {
    
    inline def apply(): SearchIndex = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchIndex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchIndex] (val x: Self) extends AnyVal {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    }
  }
  
  trait SearchLogQuery extends StObject {
    
    var entries: js.UndefOr[js.Array[EntryKind]] = js.undefined
    
    var entryUUIDs: js.UndefOr[js.Array[String]] = js.undefined
    
    var logIndexes: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object SearchLogQuery {
    
    inline def apply(): SearchLogQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchLogQuery]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchLogQuery] (val x: Self) extends AnyVal {
      
      inline def setEntries(value: js.Array[EntryKind]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setEntriesVarargs(value: EntryKind*): Self = StObject.set(x, "entries", js.Array(value*))
      
      inline def setEntryUUIDs(value: js.Array[String]): Self = StObject.set(x, "entryUUIDs", value.asInstanceOf[js.Any])
      
      inline def setEntryUUIDsUndefined: Self = StObject.set(x, "entryUUIDs", js.undefined)
      
      inline def setEntryUUIDsVarargs(value: String*): Self = StObject.set(x, "entryUUIDs", js.Array(value*))
      
      inline def setLogIndexes(value: js.Array[Double]): Self = StObject.set(x, "logIndexes", value.asInstanceOf[js.Any])
      
      inline def setLogIndexesUndefined: Self = StObject.set(x, "logIndexes", js.undefined)
      
      inline def setLogIndexesVarargs(value: Double*): Self = StObject.set(x, "logIndexes", js.Array(value*))
    }
  }
}
