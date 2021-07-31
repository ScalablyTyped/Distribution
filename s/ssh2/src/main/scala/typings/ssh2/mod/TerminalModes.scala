package typings.ssh2.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ssh2.ssh2Numbers.`0`
import typings.ssh2.ssh2Numbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminalModes
  extends StObject
     with /* mode */ StringDictionary[js.UndefOr[Double]] {
  
  /** 7 bit mode. */
  var CS7: js.UndefOr[`0` | `1`] = js.undefined
  
  /** 8 bit mode. */
  var CS8: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Enable echoing. */
  var ECHO: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Echo control characters as ^(Char). */
  var ECHOCTL: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Visually erase chars. */
  var ECHOE: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Kill character discards current line. */
  var ECHOK: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Visual erase for line kill. */
  var ECHOKE: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Echo NL even if ECHO is off. */
  var ECHONL: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Canonicalize input lines. */
  var ICANON: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Map CR to NL on input. */
  var ICRNL: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Enable extensions. */
  var IEXTEN: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Ignore CR on input. */
  var IGNCR: js.UndefOr[`0` | `1`] = js.undefined
  
  /** The ignore parity flag.  The parameter SHOULD be `0` if this flag is FALSE, and `1` if it is TRUE. */
  var IGNPAR: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Ring bell on input queue full. */
  var IMAXBEL: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Map NL into CR on input. */
  var INLCR: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Enable checking of parity errors. */
  var INPCK: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Enable signals INTR, QUIT, [D]SUSP. */
  var ISIG: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Strip 8th bit off characters. */
  var ISTRIP: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Translate uppercase characters to lowercase. */
  var IUCLC: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Any char will restart after stop. */
  var IXANY: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Enable input flow control. */
  var IXOFF: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Enable output flow control. */
  var IXON: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Don't flush after interrupt. */
  var NOFLSH: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Translate carriage return to newline (output). */
  var OCRNL: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Convert lowercase to uppercase. */
  var OLCUC: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Map NL to CR-NL. */
  var ONLCR: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Newline performs a carriage return (output). */
  var ONLRET: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Translate newline to carriage return-newline (output). */
  var ONOCR: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Enable output processing. */
  var OPOST: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Parity enable. */
  var PARENB: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Mark parity and framing errors. */
  var PARMRK: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Odd parity, else even. */
  var PARODD: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Retype pending input. */
  var PENDIN: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Stop background jobs from output. */
  var TOSTOP: js.UndefOr[`0` | `1`] = js.undefined
  
  /** Specifies the input baud rate in bits per second. */
  var TTY_OP_ISPEED: js.UndefOr[Double] = js.undefined
  
  /** Specifies the output baud rate in bits per second. */
  var TTY_OP_OSPEED: js.UndefOr[Double] = js.undefined
  
  /** Toggles the flushing of terminal output. */
  var VDISCARD: js.UndefOr[Double] = js.undefined
  
  /** Another suspend character. */
  var VDSUSP: js.UndefOr[Double] = js.undefined
  
  /** End-of-file character (sends `EOF` from the terminal). */
  var VEOF: js.UndefOr[Double] = js.undefined
  
  /** End-of-line character in addition to carriage return and/or linefeed. */
  var VEOL: js.UndefOr[Double] = js.undefined
  
  /** Additional end-of-line character. */
  var VEOL2: js.UndefOr[Double] = js.undefined
  
  /** Erase the character to left of the cursor. */
  var VERASE: js.UndefOr[Double] = js.undefined
  
  /** Character to flush output. */
  var VFLUSH: js.UndefOr[Double] = js.undefined
  
  /** Interrupt character; `255` if none. Not all of these characters are supported on all systems. */
  var VINTR: js.UndefOr[Double] = js.undefined
  
  /** Kill the current input line. */
  var VKILL: js.UndefOr[Double] = js.undefined
  
  /** Enter the next character typed literally, even if it is a special character */
  var VLNEXT: js.UndefOr[Double] = js.undefined
  
  /** The quit character (sends `SIGQUIT` signal on POSIX systems). */
  var VQUIT: js.UndefOr[Double] = js.undefined
  
  /** Reprints the current input line. */
  var VREPRINT: js.UndefOr[Double] = js.undefined
  
  /** Continues paused output (normally control-Q). */
  var VSTART: js.UndefOr[Double] = js.undefined
  
  /** Prints system status line (load, command, pid, etc). */
  var VSTATUS: js.UndefOr[Double] = js.undefined
  
  /** Pauses output (normally control-S). */
  var VSTOP: js.UndefOr[Double] = js.undefined
  
  /** Suspends the current program. */
  var VSUSP: js.UndefOr[Double] = js.undefined
  
  /** Switch to a different shell layer. */
  var VSWTCH: js.UndefOr[Double] = js.undefined
  
  /** Erases a word left of cursor. */
  var VWERASE: js.UndefOr[Double] = js.undefined
  
  /** Enable input and output of uppercase characters by preceding their lowercase equivalents with `\`. */
  var XCASE: js.UndefOr[`0` | `1`] = js.undefined
}
object TerminalModes {
  
  @scala.inline
  def apply(): TerminalModes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminalModes]
  }
  
  @scala.inline
  implicit class TerminalModesMutableBuilder[Self <: TerminalModes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCS7(value: `0` | `1`): Self = StObject.set(x, "CS7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCS7Undefined: Self = StObject.set(x, "CS7", js.undefined)
    
    @scala.inline
    def setCS8(value: `0` | `1`): Self = StObject.set(x, "CS8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCS8Undefined: Self = StObject.set(x, "CS8", js.undefined)
    
    @scala.inline
    def setECHO(value: `0` | `1`): Self = StObject.set(x, "ECHO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setECHOCTL(value: `0` | `1`): Self = StObject.set(x, "ECHOCTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setECHOCTLUndefined: Self = StObject.set(x, "ECHOCTL", js.undefined)
    
    @scala.inline
    def setECHOE(value: `0` | `1`): Self = StObject.set(x, "ECHOE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setECHOEUndefined: Self = StObject.set(x, "ECHOE", js.undefined)
    
    @scala.inline
    def setECHOK(value: `0` | `1`): Self = StObject.set(x, "ECHOK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setECHOKE(value: `0` | `1`): Self = StObject.set(x, "ECHOKE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setECHOKEUndefined: Self = StObject.set(x, "ECHOKE", js.undefined)
    
    @scala.inline
    def setECHOKUndefined: Self = StObject.set(x, "ECHOK", js.undefined)
    
    @scala.inline
    def setECHONL(value: `0` | `1`): Self = StObject.set(x, "ECHONL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setECHONLUndefined: Self = StObject.set(x, "ECHONL", js.undefined)
    
    @scala.inline
    def setECHOUndefined: Self = StObject.set(x, "ECHO", js.undefined)
    
    @scala.inline
    def setICANON(value: `0` | `1`): Self = StObject.set(x, "ICANON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICANONUndefined: Self = StObject.set(x, "ICANON", js.undefined)
    
    @scala.inline
    def setICRNL(value: `0` | `1`): Self = StObject.set(x, "ICRNL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICRNLUndefined: Self = StObject.set(x, "ICRNL", js.undefined)
    
    @scala.inline
    def setIEXTEN(value: `0` | `1`): Self = StObject.set(x, "IEXTEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIEXTENUndefined: Self = StObject.set(x, "IEXTEN", js.undefined)
    
    @scala.inline
    def setIGNCR(value: `0` | `1`): Self = StObject.set(x, "IGNCR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIGNCRUndefined: Self = StObject.set(x, "IGNCR", js.undefined)
    
    @scala.inline
    def setIGNPAR(value: `0` | `1`): Self = StObject.set(x, "IGNPAR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIGNPARUndefined: Self = StObject.set(x, "IGNPAR", js.undefined)
    
    @scala.inline
    def setIMAXBEL(value: `0` | `1`): Self = StObject.set(x, "IMAXBEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIMAXBELUndefined: Self = StObject.set(x, "IMAXBEL", js.undefined)
    
    @scala.inline
    def setINLCR(value: `0` | `1`): Self = StObject.set(x, "INLCR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINLCRUndefined: Self = StObject.set(x, "INLCR", js.undefined)
    
    @scala.inline
    def setINPCK(value: `0` | `1`): Self = StObject.set(x, "INPCK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINPCKUndefined: Self = StObject.set(x, "INPCK", js.undefined)
    
    @scala.inline
    def setISIG(value: `0` | `1`): Self = StObject.set(x, "ISIG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setISIGUndefined: Self = StObject.set(x, "ISIG", js.undefined)
    
    @scala.inline
    def setISTRIP(value: `0` | `1`): Self = StObject.set(x, "ISTRIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setISTRIPUndefined: Self = StObject.set(x, "ISTRIP", js.undefined)
    
    @scala.inline
    def setIUCLC(value: `0` | `1`): Self = StObject.set(x, "IUCLC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIUCLCUndefined: Self = StObject.set(x, "IUCLC", js.undefined)
    
    @scala.inline
    def setIXANY(value: `0` | `1`): Self = StObject.set(x, "IXANY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIXANYUndefined: Self = StObject.set(x, "IXANY", js.undefined)
    
    @scala.inline
    def setIXOFF(value: `0` | `1`): Self = StObject.set(x, "IXOFF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIXOFFUndefined: Self = StObject.set(x, "IXOFF", js.undefined)
    
    @scala.inline
    def setIXON(value: `0` | `1`): Self = StObject.set(x, "IXON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIXONUndefined: Self = StObject.set(x, "IXON", js.undefined)
    
    @scala.inline
    def setNOFLSH(value: `0` | `1`): Self = StObject.set(x, "NOFLSH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOFLSHUndefined: Self = StObject.set(x, "NOFLSH", js.undefined)
    
    @scala.inline
    def setOCRNL(value: `0` | `1`): Self = StObject.set(x, "OCRNL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOCRNLUndefined: Self = StObject.set(x, "OCRNL", js.undefined)
    
    @scala.inline
    def setOLCUC(value: `0` | `1`): Self = StObject.set(x, "OLCUC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOLCUCUndefined: Self = StObject.set(x, "OLCUC", js.undefined)
    
    @scala.inline
    def setONLCR(value: `0` | `1`): Self = StObject.set(x, "ONLCR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setONLCRUndefined: Self = StObject.set(x, "ONLCR", js.undefined)
    
    @scala.inline
    def setONLRET(value: `0` | `1`): Self = StObject.set(x, "ONLRET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setONLRETUndefined: Self = StObject.set(x, "ONLRET", js.undefined)
    
    @scala.inline
    def setONOCR(value: `0` | `1`): Self = StObject.set(x, "ONOCR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setONOCRUndefined: Self = StObject.set(x, "ONOCR", js.undefined)
    
    @scala.inline
    def setOPOST(value: `0` | `1`): Self = StObject.set(x, "OPOST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOPOSTUndefined: Self = StObject.set(x, "OPOST", js.undefined)
    
    @scala.inline
    def setPARENB(value: `0` | `1`): Self = StObject.set(x, "PARENB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPARENBUndefined: Self = StObject.set(x, "PARENB", js.undefined)
    
    @scala.inline
    def setPARMRK(value: `0` | `1`): Self = StObject.set(x, "PARMRK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPARMRKUndefined: Self = StObject.set(x, "PARMRK", js.undefined)
    
    @scala.inline
    def setPARODD(value: `0` | `1`): Self = StObject.set(x, "PARODD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPARODDUndefined: Self = StObject.set(x, "PARODD", js.undefined)
    
    @scala.inline
    def setPENDIN(value: `0` | `1`): Self = StObject.set(x, "PENDIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPENDINUndefined: Self = StObject.set(x, "PENDIN", js.undefined)
    
    @scala.inline
    def setTOSTOP(value: `0` | `1`): Self = StObject.set(x, "TOSTOP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOSTOPUndefined: Self = StObject.set(x, "TOSTOP", js.undefined)
    
    @scala.inline
    def setTTY_OP_ISPEED(value: Double): Self = StObject.set(x, "TTY_OP_ISPEED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTTY_OP_ISPEEDUndefined: Self = StObject.set(x, "TTY_OP_ISPEED", js.undefined)
    
    @scala.inline
    def setTTY_OP_OSPEED(value: Double): Self = StObject.set(x, "TTY_OP_OSPEED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTTY_OP_OSPEEDUndefined: Self = StObject.set(x, "TTY_OP_OSPEED", js.undefined)
    
    @scala.inline
    def setVDISCARD(value: Double): Self = StObject.set(x, "VDISCARD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVDISCARDUndefined: Self = StObject.set(x, "VDISCARD", js.undefined)
    
    @scala.inline
    def setVDSUSP(value: Double): Self = StObject.set(x, "VDSUSP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVDSUSPUndefined: Self = StObject.set(x, "VDSUSP", js.undefined)
    
    @scala.inline
    def setVEOF(value: Double): Self = StObject.set(x, "VEOF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVEOFUndefined: Self = StObject.set(x, "VEOF", js.undefined)
    
    @scala.inline
    def setVEOL(value: Double): Self = StObject.set(x, "VEOL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVEOL2(value: Double): Self = StObject.set(x, "VEOL2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVEOL2Undefined: Self = StObject.set(x, "VEOL2", js.undefined)
    
    @scala.inline
    def setVEOLUndefined: Self = StObject.set(x, "VEOL", js.undefined)
    
    @scala.inline
    def setVERASE(value: Double): Self = StObject.set(x, "VERASE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVERASEUndefined: Self = StObject.set(x, "VERASE", js.undefined)
    
    @scala.inline
    def setVFLUSH(value: Double): Self = StObject.set(x, "VFLUSH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVFLUSHUndefined: Self = StObject.set(x, "VFLUSH", js.undefined)
    
    @scala.inline
    def setVINTR(value: Double): Self = StObject.set(x, "VINTR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVINTRUndefined: Self = StObject.set(x, "VINTR", js.undefined)
    
    @scala.inline
    def setVKILL(value: Double): Self = StObject.set(x, "VKILL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVKILLUndefined: Self = StObject.set(x, "VKILL", js.undefined)
    
    @scala.inline
    def setVLNEXT(value: Double): Self = StObject.set(x, "VLNEXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVLNEXTUndefined: Self = StObject.set(x, "VLNEXT", js.undefined)
    
    @scala.inline
    def setVQUIT(value: Double): Self = StObject.set(x, "VQUIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVQUITUndefined: Self = StObject.set(x, "VQUIT", js.undefined)
    
    @scala.inline
    def setVREPRINT(value: Double): Self = StObject.set(x, "VREPRINT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVREPRINTUndefined: Self = StObject.set(x, "VREPRINT", js.undefined)
    
    @scala.inline
    def setVSTART(value: Double): Self = StObject.set(x, "VSTART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVSTARTUndefined: Self = StObject.set(x, "VSTART", js.undefined)
    
    @scala.inline
    def setVSTATUS(value: Double): Self = StObject.set(x, "VSTATUS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVSTATUSUndefined: Self = StObject.set(x, "VSTATUS", js.undefined)
    
    @scala.inline
    def setVSTOP(value: Double): Self = StObject.set(x, "VSTOP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVSTOPUndefined: Self = StObject.set(x, "VSTOP", js.undefined)
    
    @scala.inline
    def setVSUSP(value: Double): Self = StObject.set(x, "VSUSP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVSUSPUndefined: Self = StObject.set(x, "VSUSP", js.undefined)
    
    @scala.inline
    def setVSWTCH(value: Double): Self = StObject.set(x, "VSWTCH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVSWTCHUndefined: Self = StObject.set(x, "VSWTCH", js.undefined)
    
    @scala.inline
    def setVWERASE(value: Double): Self = StObject.set(x, "VWERASE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVWERASEUndefined: Self = StObject.set(x, "VWERASE", js.undefined)
    
    @scala.inline
    def setXCASE(value: `0` | `1`): Self = StObject.set(x, "XCASE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXCASEUndefined: Self = StObject.set(x, "XCASE", js.undefined)
  }
}
