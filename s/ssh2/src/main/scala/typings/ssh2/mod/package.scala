package typings.ssh2.mod

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Duplex
import typings.ssh2.mod.^
import typings.ssh2.ssh2Strings.append
import typings.ssh2.ssh2Strings.pageant
import typings.ssh2.ssh2Strings.prepend
import typings.ssh2.ssh2Strings.remove_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createAgent(socketPath: String): BaseAgent[String | Buffer | ParsedKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAgent")(socketPath.asInstanceOf[js.Any]).asInstanceOf[BaseAgent[String | Buffer | ParsedKey]]

inline def createAgent_pageant(socketPath: pageant): BaseAgent[String | Buffer | ParsedKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAgent")(socketPath.asInstanceOf[js.Any]).asInstanceOf[BaseAgent[String | Buffer | ParsedKey]]

type AcceptConnection[T /* <: Channel */] = js.Function0[T]

type AcceptSftpConnection = js.Function0[SFTPWrapper]

type AlgorithmList[T] = js.Array[T] | (Record[append | prepend | remove_, T | js.Array[T]])

type AuthHandlerMiddleware = js.Function3[
/* authsLeft */ js.Array[AuthenticationType], 
/* partialSuccess */ Boolean, 
/* next */ NextAuthHandler, 
Unit]

type Callback = js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]

type ChangePasswordCallback = js.Function1[/* newPassword */ String, Unit]

type ClientCallback = js.Function2[/* err */ js.UndefOr[js.Error], /* channel */ ClientChannel, Unit]

type ClientForwardCallback = js.Function2[/* err */ js.UndefOr[js.Error], /* port */ Double, Unit]

type ClientSFTPCallback = js.Function2[/* err */ js.UndefOr[js.Error], /* sftp */ SFTPWrapper, Unit]

type DebugFunction = js.Function1[/* message */ String, Unit]

type ErrorCallback = js.Function1[/* err */ js.Error, Unit]

type GetStreamCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* stream */ js.UndefOr[Duplex], Unit]

type HostFingerprintVerifier = js.Function2[/* fingerprint */ String, /* verify */ VerifyCallback, Boolean]

type HostVerifier = js.Function2[/* key */ Buffer, /* verify */ VerifyCallback, Unit]

type IdentityCallback[T /* <: String | Buffer | ParsedKey */] = js.Function2[
/* err */ js.UndefOr[js.Error | Null], 
/* keys */ js.UndefOr[KnownPublicKeys[T]], 
Unit]

type KeyboardInteractiveCallback = js.Function1[/* answers */ js.Array[String], Unit]

type KnownPublicKeys[T /* <: String | Buffer | ParsedKey */] = js.Array[T | PublicKeyEntry]

type NextAuthHandler = js.Function1[/* authName */ AuthenticationType | AnyAuthMethod, Unit]

type PrivateKeys = js.Array[Buffer | ParsedKey | EncryptedPrivateKey | String]

type RejectConnection = js.Function0[Unit]

type ServerCallback = js.Function2[/* err */ js.UndefOr[js.Error], /* channel */ ServerChannel, Unit]

type ServerConnectionListener = js.Function2[/* client */ Connection, /* info */ ClientInfo, Unit]

type SessionAccept = js.Function0[Unit]

type SessionAcceptReject = js.Function0[Unit]

type SignCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* signature */ js.UndefOr[Buffer], Unit]

type SyncHostFingerprintVerifier = js.Function1[/* fingerprint */ String, Boolean]

type SyncHostVerifier = js.Function1[/* key */ Buffer, Boolean]

type VerifyCallback = js.Function1[/* valid */ Boolean, Unit]
