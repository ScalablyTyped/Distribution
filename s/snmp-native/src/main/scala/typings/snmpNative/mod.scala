package typings.snmpNative

import typings.node.bufferMod.global.Buffer
import typings.snmpNative.anon.oidOIDOptions
import typings.snmpNative.anon.oidOIDcombinedTimeoutnumb
import typings.snmpNative.anon.oidOIDtypeDataTypeskeyofD
import typings.snmpNative.anon.oidsArrayOIDabortOnErrorb
import typings.snmpNative.snmpNativeNumbers.`-1`
import typings.snmpNative.snmpNativeNumbers.`0`
import typings.snmpNative.snmpNativeNumbers.`0x00`
import typings.snmpNative.snmpNativeNumbers.`0x01`
import typings.snmpNative.snmpNativeNumbers.`0x02`
import typings.snmpNative.snmpNativeNumbers.`0x03`
import typings.snmpNative.snmpNativeNumbers.`0x04`
import typings.snmpNative.snmpNativeNumbers.`0x05`
import typings.snmpNative.snmpNativeNumbers.`0x06`
import typings.snmpNative.snmpNativeNumbers.`0x30`
import typings.snmpNative.snmpNativeNumbers.`0x40`
import typings.snmpNative.snmpNativeNumbers.`0x41`
import typings.snmpNative.snmpNativeNumbers.`0x42`
import typings.snmpNative.snmpNativeNumbers.`0x43`
import typings.snmpNative.snmpNativeNumbers.`0x44`
import typings.snmpNative.snmpNativeNumbers.`0x45`
import typings.snmpNative.snmpNativeNumbers.`0x46`
import typings.snmpNative.snmpNativeNumbers.`0x80`
import typings.snmpNative.snmpNativeNumbers.`0x81`
import typings.snmpNative.snmpNativeNumbers.`0x82`
import typings.snmpNative.snmpNativeNumbers.`0xA0`
import typings.snmpNative.snmpNativeNumbers.`10`
import typings.snmpNative.snmpNativeNumbers.`11`
import typings.snmpNative.snmpNativeNumbers.`12`
import typings.snmpNative.snmpNativeNumbers.`13`
import typings.snmpNative.snmpNativeNumbers.`14`
import typings.snmpNative.snmpNativeNumbers.`15`
import typings.snmpNative.snmpNativeNumbers.`16`
import typings.snmpNative.snmpNativeNumbers.`17`
import typings.snmpNative.snmpNativeNumbers.`18`
import typings.snmpNative.snmpNativeNumbers.`1`
import typings.snmpNative.snmpNativeNumbers.`2`
import typings.snmpNative.snmpNativeNumbers.`3`
import typings.snmpNative.snmpNativeNumbers.`4`
import typings.snmpNative.snmpNativeNumbers.`5`
import typings.snmpNative.snmpNativeNumbers.`6`
import typings.snmpNative.snmpNativeNumbers.`7`
import typings.snmpNative.snmpNativeNumbers.`8`
import typings.snmpNative.snmpNativeNumbers.`9`
import typings.snmpNative.snmpNativeStrings.IPv4
import typings.snmpNative.snmpNativeStrings.IPv6
import typings.snmpNative.snmpNativeStrings.udp4
import typings.snmpNative.snmpNativeStrings.udp6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("snmp-native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DataTypes extends StObject {
    
    val Counter: `0x41`
    
    val Counter64: `0x46`
    
    val EndOfMibView: `0x82`
    
    val Gauge: `0x42`
    
    val Integer: `0x02`
    
    val IpAddress: `0x40`
    
    val NoSuchInstance: `0x81`
    
    val NoSuchObject: `0x80`
    
    val NsapAddress: `0x45`
    
    val Null: `0x05`
    
    val ObjectIdentifier: `0x06`
    
    val OctetString: `0x04`
    
    val Opaque: `0x44`
    
    val PDUBase: `0xA0`
    
    val Sequence: `0x30`
    
    val TimeTicks: `0x43`
  }
  object DataTypes {
    
    @JSImport("snmp-native", "DataTypes")
    @js.native
    val ^ : DataTypes = js.native
    
    extension [Self <: DataTypes](x: Self) {
      
      inline def setCounter(value: `0x41`): Self = StObject.set(x, "Counter", value.asInstanceOf[js.Any])
      
      inline def setCounter64(value: `0x46`): Self = StObject.set(x, "Counter64", value.asInstanceOf[js.Any])
      
      inline def setEndOfMibView(value: `0x82`): Self = StObject.set(x, "EndOfMibView", value.asInstanceOf[js.Any])
      
      inline def setGauge(value: `0x42`): Self = StObject.set(x, "Gauge", value.asInstanceOf[js.Any])
      
      inline def setInteger(value: `0x02`): Self = StObject.set(x, "Integer", value.asInstanceOf[js.Any])
      
      inline def setIpAddress(value: `0x40`): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
      
      inline def setNoSuchInstance(value: `0x81`): Self = StObject.set(x, "NoSuchInstance", value.asInstanceOf[js.Any])
      
      inline def setNoSuchObject(value: `0x80`): Self = StObject.set(x, "NoSuchObject", value.asInstanceOf[js.Any])
      
      inline def setNsapAddress(value: `0x45`): Self = StObject.set(x, "NsapAddress", value.asInstanceOf[js.Any])
      
      inline def setNull(value: `0x05`): Self = StObject.set(x, "Null", value.asInstanceOf[js.Any])
      
      inline def setObjectIdentifier(value: `0x06`): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
      
      inline def setOctetString(value: `0x04`): Self = StObject.set(x, "OctetString", value.asInstanceOf[js.Any])
      
      inline def setOpaque(value: `0x44`): Self = StObject.set(x, "Opaque", value.asInstanceOf[js.Any])
      
      inline def setPDUBase(value: `0xA0`): Self = StObject.set(x, "PDUBase", value.asInstanceOf[js.Any])
      
      inline def setSequence(value: `0x30`): Self = StObject.set(x, "Sequence", value.asInstanceOf[js.Any])
      
      inline def setTimeTicks(value: `0x43`): Self = StObject.set(x, "TimeTicks", value.asInstanceOf[js.Any])
    }
  }
  
  trait Errors extends StObject {
    
    val AuthorizationError: `16`
    
    val BadValue: `3`
    
    val CommitFailed: `14`
    
    val GenErr: `5`
    
    val InconsistentName: `18`
    
    val InconsistentValue: `12`
    
    val NoAccess: `6`
    
    val NoCreation: `11`
    
    val NoError: `0`
    
    val NoSuchName: `2`
    
    val NotWritable: `17`
    
    val ReadOnly: `4`
    
    val ResourceUnavailable: `13`
    
    val TooBig: `1`
    
    val UndoFailed: `15`
    
    val WrongEncoding: `9`
    
    val WrongLength: `8`
    
    val WrongType: `7`
    
    val WrongValue: `10`
  }
  object Errors {
    
    @JSImport("snmp-native", "Errors")
    @js.native
    val ^ : Errors = js.native
    
    extension [Self <: Errors](x: Self) {
      
      inline def setAuthorizationError(value: `16`): Self = StObject.set(x, "AuthorizationError", value.asInstanceOf[js.Any])
      
      inline def setBadValue(value: `3`): Self = StObject.set(x, "BadValue", value.asInstanceOf[js.Any])
      
      inline def setCommitFailed(value: `14`): Self = StObject.set(x, "CommitFailed", value.asInstanceOf[js.Any])
      
      inline def setGenErr(value: `5`): Self = StObject.set(x, "GenErr", value.asInstanceOf[js.Any])
      
      inline def setInconsistentName(value: `18`): Self = StObject.set(x, "InconsistentName", value.asInstanceOf[js.Any])
      
      inline def setInconsistentValue(value: `12`): Self = StObject.set(x, "InconsistentValue", value.asInstanceOf[js.Any])
      
      inline def setNoAccess(value: `6`): Self = StObject.set(x, "NoAccess", value.asInstanceOf[js.Any])
      
      inline def setNoCreation(value: `11`): Self = StObject.set(x, "NoCreation", value.asInstanceOf[js.Any])
      
      inline def setNoError(value: `0`): Self = StObject.set(x, "NoError", value.asInstanceOf[js.Any])
      
      inline def setNoSuchName(value: `2`): Self = StObject.set(x, "NoSuchName", value.asInstanceOf[js.Any])
      
      inline def setNotWritable(value: `17`): Self = StObject.set(x, "NotWritable", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: `4`): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
      
      inline def setResourceUnavailable(value: `13`): Self = StObject.set(x, "ResourceUnavailable", value.asInstanceOf[js.Any])
      
      inline def setTooBig(value: `1`): Self = StObject.set(x, "TooBig", value.asInstanceOf[js.Any])
      
      inline def setUndoFailed(value: `15`): Self = StObject.set(x, "UndoFailed", value.asInstanceOf[js.Any])
      
      inline def setWrongEncoding(value: `9`): Self = StObject.set(x, "WrongEncoding", value.asInstanceOf[js.Any])
      
      inline def setWrongLength(value: `8`): Self = StObject.set(x, "WrongLength", value.asInstanceOf[js.Any])
      
      inline def setWrongType(value: `7`): Self = StObject.set(x, "WrongType", value.asInstanceOf[js.Any])
      
      inline def setWrongValue(value: `10`): Self = StObject.set(x, "WrongValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait PduTypes extends StObject {
    
    val GetNextRequestPDU: `0x01`
    
    val GetRequestPDU: `0x00`
    
    val GetResponsePDU: `0x02`
    
    val SetRequestPDU: `0x03`
  }
  object PduTypes {
    
    @JSImport("snmp-native", "PduTypes")
    @js.native
    val ^ : PduTypes = js.native
    
    extension [Self <: PduTypes](x: Self) {
      
      inline def setGetNextRequestPDU(value: `0x01`): Self = StObject.set(x, "GetNextRequestPDU", value.asInstanceOf[js.Any])
      
      inline def setGetRequestPDU(value: `0x00`): Self = StObject.set(x, "GetRequestPDU", value.asInstanceOf[js.Any])
      
      inline def setGetResponsePDU(value: `0x02`): Self = StObject.set(x, "GetResponsePDU", value.asInstanceOf[js.Any])
      
      inline def setSetRequestPDU(value: `0x03`): Self = StObject.set(x, "SetRequestPDU", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("snmp-native", "Session")
  @js.native
  /**
    * @internal
    * socket: Socket;
    * @internal
    * reqs: {
    *     [key: number]: {
    *         callback: callback;
    *     }
    * };
    */
  open class Session () extends StObject {
    def this(options: SessionOptions) = this()
    
    /**
      * Cancels all outstanding requests and frees used OS resources.
      * Outstanding requests will call their callback with the
      * "Cancelled" error set.
      */
    def close(): Unit = js.native
    
    /**
      * Perform a simple GetRequest.
      *
      * The callback is called with an error object or an array of varbinds.
      *
      * @param options.oid The OID to get
      *
      * @example
      * const oid = [ 1, 3, 6, 1, 4, 1, 42, 1, 0 ];
      *
      * session.get( { oid, }, (err, varbinds) => {
      *     if( err ){
      *         console.error( 'Failed' );
      *     } else {
      *         const varbind = varbinds[0];
      *         console.log( `${varbind.oid} = ${varbind.value}` );
      *     }
      * } );
      *
      * @example
      * // Specify host and community explicitly:
      * const host = 'example.host.com';
      * const community = 'private';
      *
      * session.get( { oid, host, community, }, (err, varbinds) => {
      *     const varbind = varbinds[0];
      *     console.log( `${varbind.oid} = ${varbind.value}` );
      * } );
      */
    def get(options: oidOIDOptions, callback: ResponseCallback): Unit = js.native
    
    /**
      * Perform repeated GetRequests to fetch all the required values.
      * Multiple OIDs will get packed into as few GetRequest packets as
      * possible to minimize roundtrip delays. Gets will be issued serially
      * (not in parallell) to avoid flooding hosts.
      *
      * The callback is called with an error object or an array of varbinds.
      * If abortOnError is false (default) any variables that couldn't be
      * fetched will simply be omitted from the results. If it is true,
      * the callback is called with an error object on any failure. If the
      * combinedTimeout is triggered, the callback is called with an error
      * and the partial results.
      *
      * @param options.oids An array of OIDs to get.
      * @param options.abortOnError Whether to stop or continue when an
      * error is encountered. Default: false.
      * @param options.combinedTimeout Timeout in milliseconds that the
      * getAll() may take. Default: no timeout.
      *
      * @example
      * const oids = [
      *     [ 1, 3, 6, 1, 4, 1, 42, 1, 0 ],
      *     [ 1, 3, 6, 1, 4, 1, 42, 2, 0 ],
      * ];
      *
      * session.getAll( { oids, }, (err, varbinds) => {
      *     if( err && !varbinds ){
      *         console.error( 'Failed' );
      *     } else {
      *         if( err ){
      *             console.log( 'Partial results' );
      *         }
      *         varbinds.forEach( varbind => {
      *             console.log( `${varbind.oid} = ${varbind.value}` );
      *         } );
      *     }
      * } );
      */
    def getAll(options: oidsArrayOIDabortOnErrorb, callback: ResponseCallback): Unit = js.native
    
    /**
      * Perform a simple GetNextRequest.
      *
      * The callback is called with an error object or an array of varbinds.
      *
      * @param options.oid The OID to get
      *
      * @example
      * const oid = [ 1, 3, 6, 1, 4, 1, 42, 1, 0 ];
      *
      * session.getNext( { oid, }, (err, varbinds) => {
      *     if( err ){
      *         console.error( 'Failed' );
      *     } else {
      *         const varbind = varbinds[0];
      *         console.log( `${varbind.oid} = ${varbind.value}` );
      *     }
      * } );
      */
    def getNext(options: oidOIDOptions, callback: ResponseCallback): Unit = js.native
    
    /**
      * Perform repeated GetNextRequests to fetch all values in the
      * specified tree.
      *
      * The callback is called with an error object or an array of
      * varbinds. If the combinedTimeout is triggered, the callback
      * is called with an error and the partial results.
      *
      * @param options.oid The OID to get.
      * @param options.combinedTimeout Timeout in milliseconds that the
      * getAll() may take. Default: no timeout.
      *
      * @example
      * const oid = [ 1, 3, 6, 1, 4, 1, 42, 1, 0 ];
      *
      * session.getSubtree( { oids, }, (err, varbinds) => {
      *     if( err && !varbinds ){
      *         console.error( 'Failed' );
      *     } else {
      *         if( err ){
      *             console.log( 'Partial results' );
      *         }
      *         varbinds.forEach( varbind => {
      *             console.log( `${varbind.oid} = ${varbind.value}` );
      *         } );
      *     }
      * } );
      */
    def getSubtree(options: oidOIDcombinedTimeoutnumb, callback: ResponseCallback): Unit = js.native
    
    var options: SessionOptions = js.native
    
    /**
      * Perform a simple SetRequest.
      *
      * @param options.oid The OID to set.
      * @param options.value The value to set.
      * @param options.type The type of the value. Supported data types are:
      * * Integer (2);
      * * Gague (66);
      * * IpAddress (64);
      * * OctetString (4); and
      * * Null (5).
      *
      * @example
      * const oid = [ 1, 3, 6, 1, 4, 1, 42, 1, 0 ];
      * const type = snmp.DataTypes.Integer; // => 2
      *
      * session.set( { oid, type, value: 42, }, (err, varbinds) => {
      *     if( err ){
      *         console.error( 'Failed' );
      *     } else {
      *         const varbind = varbinds[0];
      *         console.log( 'Set completed' );
      *         console.log( `${varbind.oid} = ${varbind.value}` );
      *     }
      * } );
      */
    def set(options: oidOIDtypeDataTypeskeyofD): Unit = js.native
    def set(options: oidOIDtypeDataTypeskeyofD, callback: ResponseCallback): Unit = js.native
  }
  
  trait Versions extends StObject {
    
    val SNMPv1: `0`
    
    val SNMPv2c: `1`
  }
  object Versions {
    
    @JSImport("snmp-native", "Versions")
    @js.native
    val ^ : Versions = js.native
    
    extension [Self <: Versions](x: Self) {
      
      inline def setSNMPv1(value: `0`): Self = StObject.set(x, "SNMPv1", value.asInstanceOf[js.Any])
      
      inline def setSNMPv2c(value: `1`): Self = StObject.set(x, "SNMPv2c", value.asInstanceOf[js.Any])
    }
  }
  
  inline def compareOids(): `-1` | `0` | `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("compareOids")().asInstanceOf[`-1` | `0` | `1`]
  inline def compareOids(oidA: Unit, oidB: OID): `-1` | `0` | `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareOids")(oidA.asInstanceOf[js.Any], oidB.asInstanceOf[js.Any])).asInstanceOf[`-1` | `0` | `1`]
  inline def compareOids(oidA: OID): `-1` | `0` | `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("compareOids")(oidA.asInstanceOf[js.Any]).asInstanceOf[`-1` | `0` | `1`]
  inline def compareOids(oidA: OID, oidB: OID): `-1` | `0` | `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareOids")(oidA.asInstanceOf[js.Any], oidB.asInstanceOf[js.Any])).asInstanceOf[`-1` | `0` | `1`]
  
  @JSImport("snmp-native", "defaultOptions")
  @js.native
  val defaultOptions: SessionOptions = js.native
  
  inline def encode(pkt: Packet): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(pkt.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def parse(buf: Buffer): Packet = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buf.asInstanceOf[js.Any]).asInstanceOf[Packet]
  
  type OID = String | js.Array[Double]
  
  trait Options extends StObject {
    
    /**
      * The SNMP community name.
      */
    var community: js.UndefOr[String] = js.undefined
    
    /**
      * The host to send the request to. Any resolvable name is allowed in
      * addition to IP addresses.
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * The UDP port number to send the request to.
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * An array of timeout values. Values are times in milliseconds, the
      * length of the array is the total number of transmissions that will
      * occur. Defaults to four attempts with five seconds between each.
      *
      * Re-transmissions can be disabled by providing a single timeout
      * value.
      *
      *
      * @example
      * [ 5000 ] // Disable re-transmission
      *
      */
    var timeouts: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCommunity(value: String): Self = StObject.set(x, "community", value.asInstanceOf[js.Any])
      
      inline def setCommunityUndefined: Self = StObject.set(x, "community", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setTimeouts(value: js.Array[Double]): Self = StObject.set(x, "timeouts", value.asInstanceOf[js.Any])
      
      inline def setTimeoutsUndefined: Self = StObject.set(x, "timeouts", js.undefined)
      
      inline def setTimeoutsVarargs(value: Double*): Self = StObject.set(x, "timeouts", js.Array(value*))
    }
  }
  
  trait PDU extends StObject {
    
    var error: Double
    
    var errorIndex: Double
    
    var reqid: Double
    
    var `type`: Double
    
    var varbinds: js.Array[VarBind]
  }
  object PDU {
    
    inline def apply(error: Double, errorIndex: Double, reqid: Double, `type`: Double, varbinds: js.Array[VarBind]): PDU = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorIndex = errorIndex.asInstanceOf[js.Any], reqid = reqid.asInstanceOf[js.Any], varbinds = varbinds.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PDU]
    }
    
    extension [Self <: PDU](x: Self) {
      
      inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorIndex(value: Double): Self = StObject.set(x, "errorIndex", value.asInstanceOf[js.Any])
      
      inline def setReqid(value: Double): Self = StObject.set(x, "reqid", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVarbinds(value: js.Array[VarBind]): Self = StObject.set(x, "varbinds", value.asInstanceOf[js.Any])
      
      inline def setVarbindsVarargs(value: VarBind*): Self = StObject.set(x, "varbinds", js.Array(value*))
    }
  }
  
  trait Packet extends StObject {
    
    var community: String
    
    var pdu: PDU
    
    var version: `0` | `1`
  }
  object Packet {
    
    inline def apply(community: String, pdu: PDU, version: `0` | `1`): Packet = {
      val __obj = js.Dynamic.literal(community = community.asInstanceOf[js.Any], pdu = pdu.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packet]
    }
    
    extension [Self <: Packet](x: Self) {
      
      inline def setCommunity(value: String): Self = StObject.set(x, "community", value.asInstanceOf[js.Any])
      
      inline def setPdu(value: PDU): Self = StObject.set(x, "pdu", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: `0` | `1`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type ResponseCallback = js.Function2[/* err */ js.Error | Null, /* varbinds */ js.Array[VarBind], Unit]
  
  trait ResponseInfo extends StObject {
    
    var address: String
    
    var family: IPv4 | IPv6
    
    var port: Double
    
    var size: Double
  }
  object ResponseInfo {
    
    inline def apply(address: String, family: IPv4 | IPv6, port: Double, size: Double): ResponseInfo = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseInfo]
    }
    
    extension [Self <: ResponseInfo](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setFamily(value: IPv4 | IPv6): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait SessionOptions
    extends StObject
       with Options {
    
    /**
      * The UDP port used to bind the socket locally, or 0 to use a
      * random port.
      */
    var bindPort: js.UndefOr[Double] = js.undefined
    
    /**
      * Address family to bind to. This is only used by the Session
      * constructor since that is when the bind is done.
      */
    var family: js.UndefOr[udp4 | udp6] = js.undefined
    
    /**
      * Function responsible for handling incoming messages and sending UDP
      * responses back. If nothing is given here, the default implementation
      * is used. This is useful if you want to implement custom logic in
      * your application.
      */
    var msgReceived: js.UndefOr[js.Function2[/* message */ Buffer, /* rinfo */ ResponseInfo, Unit]] = js.undefined
  }
  object SessionOptions {
    
    inline def apply(): SessionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionOptions]
    }
    
    extension [Self <: SessionOptions](x: Self) {
      
      inline def setBindPort(value: Double): Self = StObject.set(x, "bindPort", value.asInstanceOf[js.Any])
      
      inline def setBindPortUndefined: Self = StObject.set(x, "bindPort", js.undefined)
      
      inline def setFamily(value: udp4 | udp6): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setMsgReceived(value: (/* message */ Buffer, /* rinfo */ ResponseInfo) => Unit): Self = StObject.set(x, "msgReceived", js.Any.fromFunction2(value))
      
      inline def setMsgReceivedUndefined: Self = StObject.set(x, "msgReceived", js.undefined)
    }
  }
  
  trait VarBind extends StObject {
    
    /**
      * The represented OID (in array form).
      */
    var oid: js.Array[Double]
    
    /**
      * The timestamp (in milliseconds) when the response was received.
      */
    var receiveStamp: Double
    
    /**
      * The timestamp (in milliseconds) when the request was transmitted.
      */
    var sendStamp: Double
    
    /**
      * The integer type code for the returned value.
      */
    var `type`: `0x82` | `0x42` | `0x80` | `0x41` | `0xA0` | `0x02` | `0x30` | `0x44` | `0x46` | `0x45` | `0x06` | `0x43` | `0x05` | `0x04` | `0x40` | `0x81`
    
    /**
      * The value, in decoded form. This will be an integer for integer,
      * gauge, counter and timetick types, a string for an octet string
      * value, an array for array or IP number types.
      */
    var value: Any
    
    /**
      * For octet string values, this is a hex string representation of the value.
      */
    var valueHex: js.UndefOr[String] = js.undefined
    
    /**
      * For octet string values, this is a raw Buffer representing the string.
      */
    var valueRaw: Buffer
  }
  object VarBind {
    
    inline def apply(
      oid: js.Array[Double],
      receiveStamp: Double,
      sendStamp: Double,
      `type`: `0x82` | `0x42` | `0x80` | `0x41` | `0xA0` | `0x02` | `0x30` | `0x44` | `0x46` | `0x45` | `0x06` | `0x43` | `0x05` | `0x04` | `0x40` | `0x81`,
      value: Any,
      valueRaw: Buffer
    ): VarBind = {
      val __obj = js.Dynamic.literal(oid = oid.asInstanceOf[js.Any], receiveStamp = receiveStamp.asInstanceOf[js.Any], sendStamp = sendStamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueRaw = valueRaw.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VarBind]
    }
    
    extension [Self <: VarBind](x: Self) {
      
      inline def setOid(value: js.Array[Double]): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
      
      inline def setOidVarargs(value: Double*): Self = StObject.set(x, "oid", js.Array(value*))
      
      inline def setReceiveStamp(value: Double): Self = StObject.set(x, "receiveStamp", value.asInstanceOf[js.Any])
      
      inline def setSendStamp(value: Double): Self = StObject.set(x, "sendStamp", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: `0x82` | `0x42` | `0x80` | `0x41` | `0xA0` | `0x02` | `0x30` | `0x44` | `0x46` | `0x45` | `0x06` | `0x43` | `0x05` | `0x04` | `0x40` | `0x81`
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueHex(value: String): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
      
      inline def setValueHexUndefined: Self = StObject.set(x, "valueHex", js.undefined)
      
      inline def setValueRaw(value: Buffer): Self = StObject.set(x, "valueRaw", value.asInstanceOf[js.Any])
    }
  }
}
