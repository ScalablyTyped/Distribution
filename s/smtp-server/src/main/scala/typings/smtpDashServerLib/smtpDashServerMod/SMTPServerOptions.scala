package typings
package smtpDashServerLib.smtpDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SMTPServerOptions
  extends nodeLib.tlsMod.TlsOptions {
  /**
       * optional boolean, if set to true allows authentication even if connection is not secured first
       */
  var allowInsecureAuth: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * optional array of allowed authentication methods, defaults to ['PLAIN', 'LOGIN'].
       * Only the methods listed in this array are allowed,
       * so if you set it to ['XOAUTH2'] then PLAIN and LOGIN are not available.
       * Use ['PLAIN', 'LOGIN', 'XOAUTH2'] to allow all three.
       * Authentication is only allowed in secure mode
       * (either the server is started with secure: true option or STARTTLS command is used)
       */
  var authMethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * allow authentication, but do not require it
       */
  var authOptional: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * optional greeting message.
       * This message is appended to the default ESMTP response.
       */
  var banner: js.UndefOr[java.lang.String] = js.undefined
  /** optionally override the trusted CA certificates */
  @JSName("ca")
  var ca_SMTPServerOptions: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer]
  ] = js.undefined
  /** optional cert chains in PEM format */
  @JSName("cert")
  var cert_SMTPServerOptions: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer]
  ] = js.undefined
  /**
       * How many millisceonds to wait before disconnecting pending
       * connections once `server.close()` has been called (defaults to 30 seconds)
       */
  var closeTimeout: js.UndefOr[ms] = js.undefined
  /**
       * optional boolean, if set to true then does not try to reverse resolve client hostname
       */
  var disableReverseLookup: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * optional array of disabled commands (see all supported commands here).
       * For example if you want to disable authentication,
       * use ['AUTH'] as this value.
       * If you want to allow authentication in clear text, set it to ['STARTTLS'].
       */
  var disabledCommands: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * optional boolean, if set to true then does not show 8BITMIME in features list
       */
  var hide8BITMIME: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * optional boolean, if set to true then does not show PIPELINING in feature list
       */
  var hidePIPELINING: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * optional boolean, if set to true then does not show SMTPUTF8 in features list
       */
  var hideSMTPUTF8: js.UndefOr[scala.Boolean] = js.undefined
   // TODO: ('AUTH' | 'STARTTLS' | 'XCLIENT' | 'XFORWARD')[];
  /**
       * optional boolean, if set to true then allow using STARTTLS
       * but do not advertise or require it. It only makes sense
       * when creating integration test servers for testing the scenario
       * where you want to try STARTTLS even when it is not advertised
       */
  var hideSTARTTLS: js.UndefOr[scala.Boolean] = js.undefined
  /** optional private keys in PEM format */
  @JSName("key")
  var key_SMTPServerOptions: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer] | js.Array[smtpDashServerLib.Anon_Passphrase]
  ] = js.undefined
  /**
       * boolean, if set to true use LMTP protocol instead of SMTP
       */
  var lmtp: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * optional bunyan compatible logger instance.
       * If set to true then logs to console.
       * If value is not set or is false then nothing is logged
       */
  var logger: js.UndefOr[nodemailerLib.libSharedMod.Logger | scala.Boolean] = js.undefined
  /**
       * sets the maximum number of concurrently connected clients, defaults to Infinity
       */
  var maxClients: js.UndefOr[scala.Double] = js.undefined
  /**
       * optional hostname of the server,
       * used for identifying to the client (defaults to os.hostname())
       */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
       * optional boolean, if set to true then upgrade sockets to TLS immediately after connection is established. Works with secure: true
       */
  var needsUpgrade: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The callback to handle authentications ([see details](https://github.com/andris9/smtp-server#handling-authentication))
       */
  var onAuth: js.UndefOr[
    js.Function3[
      /* auth */ SMTPServerAuthentication, 
      /* session */ SMTPServerSession, 
      /* callback */ js.Function2[
        /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
        /* response */ js.UndefOr[SMTPServerAuthenticationResponse], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * the callback that informs about closed client connection
       */
  var onClose: js.UndefOr[
    js.Function2[
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * The callback to handle the client connection. ([see details](https://github.com/andris9/smtp-server#validating-client-connection))
       */
  var onConnect: js.UndefOr[
    js.Function2[
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * the callback to handle incoming messages ([see details](https://github.com/andris9/smtp-server#processing-incoming-message))
       */
  var onData: js.UndefOr[
    js.Function3[
      /* stream */ nodeLib.streamMod.Readable, 
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * the callback to validate MAIL FROM commands ([see details](https://github.com/andris9/smtp-server#validating-sender-addresses))
       */
  var onMailFrom: js.UndefOr[
    js.Function3[
      /* address */ SMTPServerAddress, 
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * The callback to validate RCPT TO commands ([see details](https://github.com/andris9/smtp-server#validating-recipient-addresses))
       */
  var onRcptTo: js.UndefOr[
    js.Function3[
      /* address */ SMTPServerAddress, 
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * if true, the connection will use TLS. The default is false.
       * If the server doesn't start in TLS mode,
       * it is still possible to upgrade clear text socket to
       * TLS socket with the STARTTLS command (unless you disable support for it).
       * If secure is true, additional tls options for tls.
       * createServer can be added directly onto this options object.
       */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /** indicate an TLS server where TLS is handled upstream */
  var secured: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * optional maximum allowed message size in bytes
       * ([see details](https://github.com/andris9/smtp-server#using-size-extension))
       */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
       * optional Map or an object of TLS options for SNI where servername is the key. Overrided by SNICallback.
       */
  var sniOptions: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[nodeLib.tlsMod.TlsOptions] | (stdLib.Map[java.lang.String, nodeLib.tlsMod.TlsOptions])
  ] = js.undefined
  /**
       * How many milliseconds of inactivity to allow before disconnecting the client (defaults to 1 minute)
       */
  var socketTimeout: js.UndefOr[ms] = js.undefined
  /**
       * boolean, if set to true expects to be behind a proxy that emits a
       * [PROXY](http://www.haproxy.org/download/1.5/doc/proxy-protocol.txt) header (version 1 only)
       */
  var useProxy: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * boolean, if set to true, enables usage of
       * [XCLIENT](http://www.postfix.org/XCLIENT_README.html) extension to override connection properties.
       * See session.xClient (Map object) for the details provided by the client
       */
  var useXClient: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * boolean, if set to true, enables usage of [XFORWARD](http://www.postfix.org/XFORWARD_README.html) extension.
       * See session.xForward (Map object) for the details provided by the client
       */
  var useXForward: js.UndefOr[scala.Boolean] = js.undefined
}

