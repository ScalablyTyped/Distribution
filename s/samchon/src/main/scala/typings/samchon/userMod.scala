package typings.samchon

import typings.ecol.hashMapCollectionMod.HashMapCollection
import typings.samchon.clientMod.Client
import typings.samchon.iprotocolMod.IProtocol
import typings.samchon.serviceServerMod.Server
import typings.samchon.webClientDriverMod.WebClientDriver
import typings.tstl.entryMod.Entry
import typings.tstl.hashMapMod.HashMap
import typings.tstl.hashMapMod.HashMap.Iterator
import typings.tstl.hashMapMod.HashMap.ReverseIterator
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipairMod.IPair
import typings.tstl.mapContainerMod.MapContainer.InsertRet
import typings.tstl.pairMod.Pair
import typings.tstl.tstlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/templates/service/User", JSImport.Namespace)
@js.native
object userMod extends js.Object {
  
  @js.native
  abstract class User protected ()
    extends HashMapCollection[Double, Client]
       with IProtocol {
    /**
      * Construct from its parent {@link Server}.
      *
      * @param server The parent {@link Server} object.
      */
    def this(server: Server) = this()
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    /* protected */ override def _Erase_by_key(key: Double): Double = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    /* protected */ override def _Erase_by_range(first: Iterator[Double, Client]): Iterator[Double, Client] = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    /* protected */ override def _Erase_by_range(first: Iterator[Double, Client], last: Iterator[Double, Client]): Iterator[Double, Client] = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    /* protected */ override def _Handle_erase(first: Iterator[Double, Client], last: Iterator[Double, Client]): Unit = js.native
    
    /**
      * @hidden
      */
    var _Handle_erase_client: js.Any = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    /* protected */ override def _Handle_insert(first: Iterator[Double, Client], last: Iterator[Double, Client]): Unit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    /* protected */ override def _Insert_by_range[InputIterator /* <: IForwardIterator[IPair[Double, Client], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    
    /**
      * @hidden
      */
    var account_id_ : js.Any = js.native
    
    /**
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    /* InferMemberOverrides */
    override def assign[InputIterator /* <: IForwardIterator[IPair[Double, Client], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    
    /**
      * @hidden
      */
    var authority_ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def clear(): Unit = js.native
    
    /**
      * @inheritDoc
      */
    /**
      * Count elements with a specified key.
      *
      * @param key Key to search for.
      * @return Number of elements with the specified key.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def count(key: Double): Double = js.native
    
    /**
      * Factory method creating a {@link Client} object.
      *
      * @param driver A web communicator for remote client.
      * @return A newly created {@link Client} object.
      */
    /* protected */ def createClient(driver: WebClientDriver): Client = js.native
    
    /**
      * Default Destructor.
      *
      * This {@link destructor destructor()} method is called when the {@link User} object is destructed. The
      * {@link User} object is destructed when connections with the remote clients are all closed, that is all the
      * children {@link Client} objects are all removed, and 30 seconds has left. If some remote client connects
      * within the 30 seconds, then the {@link User} object doesn't be destructed.
      *
      * Note that, don't call this {@link destructor destructor()} method by yourself. It must be called automatically
      * by those *destruction* cases. Also, if your derived {@link User} class has something to do on the
      * *destruction*, then overrides this {@link destructor destructor()} method and defines the something to do.
      * Overriding this {@link destructor destructor()}, don't forget to calling ```super.destructor();``` on tail.
      *
      * ```typescript
      * class MyUser extends service.User
      * {
      *     protected destructor(): void
      *     {
      *         // DO SOMETHING
      *         this.do_something();
      *
      *         // CALL SUPER.DESTRUCTOR() ON TAIL. DON'T FORGET THIS
      *         super.destructor();
      *     }
      * }
      * ```
      */
    /* protected */ def destructor(): Unit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def emplace(key: Double, `val`: Client): InsertRet[
        Double, 
        Client, 
        `true`, 
        HashMap[Double, Client], 
        Iterator[Double, Client], 
        ReverseIterator[Double, Client]
      ] = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def emplace_hint(hint: Iterator[Double, Client], key: Double, `val`: Client): Iterator[Double, Client] = js.native
    
    /**
      * Erase elements in range.
      *
      * @param first Range of the first position to erase.
      * @param last Rangee of the last position to erase.
      * @return Iterator following the last removed element, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(first: Iterator[Double, Client], last: Iterator[Double, Client]): Iterator[Double, Client] = js.native
    /**
      * Erase an element.
      *
      * @param pos Position to erase.
      * @return Iterator following the *pos*, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(pos: Iterator[Double, Client]): Iterator[Double, Client] = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    @JSName("erase")
    override def erase_IteratorT(it: Iterator[Double, Client]): Iterator[Double, Client] = js.native
    
    /**
      * Extract an element by key.
      *
      * @param key Key to search for.
      * @return The extracted element.
      */
    /* InferMemberOverrides */
    override def extract(key: Double): Entry[Double, Client] = js.native
    /**
      * Extract an element by iterator.
      *
      * @param pos The iterator to the element for extraction.
      * @return Iterator following the *pos*, strained by the extraction.
      */
    /* InferMemberOverrides */
    @JSName("extract")
    override def extract_Iterator(pos: Iterator[Double, Client]): Iterator[Double, Client] = js.native
    
    /**
      * @inheritDoc
      */
    /**
      * Get iterator to element.
      *
      * @param key Key to search for.
      * @return An iterator to the element, if the specified key is found, otherwise `this.end()`.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def find(key: Double): Iterator[Double, Client] = js.native
    
    /**
      * Get a value.
      *
      * @param key Key to search for.
      * @return The value mapped by the key.
      */
    /* InferMemberOverrides */
    override def get(key: Double): Client = js.native
    
    /**
      * Get account id.
      *
      * @return Account ID.
      */
    def getAccountID(): String = js.native
    
    /**
      * Get authority.
      *
      * @return Authority
      */
    def getAuthority(): Double = js.native
    
    /**
      * Get parent {@lin Server} object.
      *
      * @return Parent {@link Server} object.
      */
    def getServer(): Server = js.native
    
    /**
      * @inheritDoc
      */
    /**
      * Test whether a key exists.
      *
      * @param key Key to search for.
      * @return Whether the specified key exists.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def has(key: Double): Boolean = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def insert(hint: Iterator[Double, Client], pair: IPair[Double, Client]): Iterator[Double, Client] = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def insert(pair: IPair[Double, Client]): InsertRet[
        Double, 
        Client, 
        `true`, 
        HashMap[Double, Client], 
        Iterator[Double, Client], 
        ReverseIterator[Double, Client]
      ] = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def insert[InputIterator /* <: IForwardIterator[IPair[Double, Client], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    
    /**
      * Insert or assign an element with hint.
      *
      * @param hint Hint for the position where the element can be inserted.
      * @param key Key to be mapped or search for.
      * @param value Value to insert or assign.
      * @return An iterator to the newly inserted element, if the specified key doesn't exist, otherwise an iterator to the ordinary element.
      */
    /* InferMemberOverrides */
    override def insert_or_assign(hint: Iterator[Double, Client], key: Double, value: Client): Iterator[Double, Client] = js.native
    /**
      * Insert or assign an element.
      *
      * @param key Key to be mapped or search for.
      * @param value Value to insert or assign.
      * @return {@link Pair} of an iterator to the newly inserted element and `true`, if the specified *key* doesn't exist, otherwise {@link Pair} of iterator to the ordinary element and `false`.
      */
    /* InferMemberOverrides */
    override def insert_or_assign(key: Double, value: Client): Pair[Iterator[Double, Client], Boolean] = js.native
    
    /**
      * Log-out.
      *
      * This {@link logout logout()} method configures {@link getAccountID account id} to empty string and
      * {@link getAuthority authority} to zero.
      *
      * The ordinary {@link getAccountID account id} will be also erased from the parent {@link Server} object. You
      * can't access this {@link User} object from {@link Server.has Server.has()} and {@link Server.get Server.get()}
      * with the ordinary {@link getAccountID account id} more.
      */
    def logout(): Unit = js.native
    
    /**
      * Merge two containers.
      *
      * @param source Source container to transfer.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def merge(source: HashMap[Double, Client]): Unit = js.native
    
    /**
      * @hidden
      */
    var sequence_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var server_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var session_id_ : js.Any = js.native
    
    /**
      * Set a value with key.
      *
      * @param key Key to be mapped or search for.
      * @param val Value to insert or assign.
      */
    /* InferMemberOverrides */
    override def set(key: Double, `val`: Client): Unit = js.native
    
    /**
      * Set *account id* and *authority*.
      *
      * The {@link setAccount setAccount()} is a method configuring *account id* and *authority* of this {@link User}.
      *
      * After the configuring, the {@link getAccountID account id} is enrolled into the parent {@link Server} as a
      * **key** for this {@link User} object. You can test existence and access this {@link User} object from
      * {@link Server.has Server.has()} and {@link Server.get Server.get()} with the {@link getAccountID account id}.
      * Of course, if ordinary {@link getAccountID account id} had existed, then the ordinary **key** will be
      * replaced.
      *
      * As you suggest, this {@link setAccount setAccount()} is something like a **log-in** function. If what you want
      * is not **logging-in**, but **logging-out**, then configure the *account id* to empty string ``""```` or call
      * the {@link lgout logout()} method.
      *
      * @param id To be account id.
      * @param authority To be authority.
      */
    def setAccount(id: String, authority: Double): Unit = js.native
    
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    /* InferMemberOverrides */
    override def swap(obj: HashMap[Double, Client]): Unit = js.native
    
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    /* InferMemberOverrides */
    override def toJSON(): js.Array[Entry[Double, Client]] = js.native
  }
}
