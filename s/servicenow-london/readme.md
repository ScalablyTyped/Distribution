```
/**
 * The scoped GlideDate class provides methods for performing operations on GlideDate
 * objects, such as instantiating GlideDate objects or working with GlideDate fields.
 */
/* tslint:disable:unified-signatures */

/**
 * The scoped GlideDateTime class provides methods for performing operations on GlideDateTime
 * objects, such as instantiating GlideDateTime objects or working with glide_date_time fields.
 */
/* tslint:disable:unified-signatures */

/**
 * The scoped GlideDuration class provides methods for working with spans of time or durations.
 *
 * GlideDuration objects store the duration as a date and time from January 1, 1970, 00:00:00.
 * As a result, setValue() and getValue() use the scoped GlideDateTime object for parameters and
 * return values.
 */
/* tslint:disable:unified-signatures */

/**
 * The scoped GlideEmailOutbound class implements the email object for scoped applications.
 * You can use the GlideEmailOutbound methods with the email global object available in mail
 * scripts. The email object behaves identically for global and scoped applications.
 */
/**
 * The Scoped GlideFilter API provides a method to determine if a record meets a specified set of
 * requirements.
 *
 * There is no constructor for Scoped GlideFilter. It is accessed by using the global object
 * `GlideFilter`.
 */
/**
 * GlideLocale provides information about display information for the local instance.
 *
 * There is no constructor for a GlideLocale object. Use the `get()` method to get a GlideLocale
 * object.
 */
/**
 * The scoped GlidePluginManager API provides a method for determining if a plugin has been
 * activated.
 */
/* tslint:disable:unified-signatures */

/**
 * The scoped GlideSchedule API provides methods for performing operations on GlideSchedule
 * objects, such as adding new schedule segments to a schedule, determining if a datetime is within
 * the schedule, or setting the schedule timezone.
 */
/**
 * The GlideScopedEvaluator API allows you to evaluate scripts in a GlideRecord field from
 * both scoped and global server scripts.
 */
/* tslint:disable:unified-signatures */

/**
 * ServiceNow processors are equivalent to Java servlets.
 *
 * Processors provide a customizable URL endpoint that can execute arbitrary server-side JavaScript
 * code and produce output such as TEXT, JSON, or HTML. The `GlideScriptedProcessor` APIs are used
 * in processor scripts to access the the processor (servlet) capabilities. There are no
 * constructors for the `GlideScriptedProcessor` APIs. The methods are called using the global
 * variable `g_processor`.
 *
 * A useful global variable, `g_target`, is available in processor scripts. It contains the table
 * name extracted from the URL.
 *
 * The URL to a processor has the format:
 * `https://<instance name.servicenow.com>/<path endpoint>.do?<parameter endpoint>=<value>`
 * where the path endpoint and parameter endpoint are defined on the processor form.
 */
/**
 * The scoped GlideSecureRandomUtil API provides methods for generating integers, long values, and
 * strings.
 *
 * There is no constructor for this class. Methods are accessed through the static object
 * `GlideSecureRandomUtil`. The `GlideSecureRandomUtil` class is available in both global and scoped
 *  applications.
 */
/* tslint:disable:unified-signatures */

/**
 * The scoped GlideTime class provides methods for performing operations on GlideTime
 * objects, such as instantiating GlideTime objects or working with GlideTime fields.
 */
/* tslint:disable:unified-signatures */

/**
 * The scoped GlideElementDescriptor API provides information about individual fields.
 *
 * There is no constructor for this class. Use the GlideElement `getED()` method to obtain a
 * GlideElementDescriptor object.
 *
 * Actual type com.glide.db.ElementDescriptor (JavaObject).
 */
/**
 * The Scoped GlideElement API provides a number of convenient script methods for dealing
 * with fields and their values. Scoped GlideElement methods are available for the fields of the
 * current GlideRecord.
 */
/* tslint:disable:unified-signatures no-misused-new */

/**
 * Scoped GlideRecord is used for database operations.
 */
// Type definitions for non-npm package servicenow-london 1.0
// Project: https://developer.servicenow.com/app.do#!/api_doc?v=london
// Definitions by: John Caruso <https://github.com/johncaruso>
//                 Bryce Godfrey <https://github.com/bryceg>
//                 Garrett Griffin <https://github.com/grgisme>
//                 Erik Myrold <https://github.com/emyrold>
//                 Tim Woodruff <https://github.com/thisnameissoclever>
//                 Anim Yeboah <https://github.com/ayeboah>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.8
/**
 * The scoped GlideDate class provides methods for performing operations on GlideDate
 * objects, such as instantiating GlideDate objects or working with GlideDate fields.
 */
/* tslint:disable:unified-signatures */

/**
 * The scoped GlideDateTime class provides methods for performing operations on GlideDateTime
 * objects, such as instantiating GlideDateTime objects or working with glide_date_time fields.
 */
/* tslint:disable:unified-signatures */

/**
 * The scoped GlideDuration class provides methods for working with spans of time or durations.
 *
 * GlideDuration objects store the duration as a date and time from January 1, 1970, 00:00:00.
 * As a result, setValue() and getValue() use the scoped GlideDateTime object for parameters and
 * return values.
 */
/* tslint:disable:unified-signatures */

/**
 * The scoped GlideEmailOutbound class implements the email object for scoped applications.
 * You can use the GlideEmailOutbound methods with the email global object available in mail
 * scripts. The email object behaves identically for global and scoped applications.
 */
/**
 * The Scoped GlideFilter API provides a method to determine if a record meets a specified set of
 * requirements.
 *
 * There is no constructor for Scoped GlideFilter. It is accessed by using the global object
 * `GlideFilter`.
 */
/**
 * GlideLocale provides information about display information for the local instance.
 *
 * There is no constructor for a GlideLocale object. Use the `get()` method to get a GlideLocale
 * object.
 */
/**
 * The scoped GlidePluginManager API provides a method for determining if a plugin has been
 * activated.
 */
/* tslint:disable:unified-signatures */

/**
 * The scoped GlideSchedule API provides methods for performing operations on GlideSchedule
 * objects, such as adding new schedule segments to a schedule, determining if a datetime is within
 * the schedule, or setting the schedule timezone.
 */
/**
 * The GlideScopedEvaluator API allows you to evaluate scripts in a GlideRecord field from
 * both scoped and global server scripts.
 */
/* tslint:disable:unified-signatures */

/**
 * ServiceNow processors are equivalent to Java servlets.
 *
 * Processors provide a customizable URL endpoint that can execute arbitrary server-side JavaScript
 * code and produce output such as TEXT, JSON, or HTML. The `GlideScriptedProcessor` APIs are used
 * in processor scripts to access the the processor (servlet) capabilities. There are no
 * constructors for the `GlideScriptedProcessor` APIs. The methods are called using the global
 * variable `g_processor`.
 *
 * A useful global variable, `g_target`, is available in processor scripts. It contains the table
 * name extracted from the URL.
 *
 * The URL to a processor has the format:
 * `https://<instance name.servicenow.com>/<path endpoint>.do?<parameter endpoint>=<value>`
 * where the path endpoint and parameter endpoint are defined on the processor form.
 */
/**
 * The scoped GlideSecureRandomUtil API provides methods for generating integers, long values, and
 * strings.
 *
 * There is no constructor for this class. Methods are accessed through the static object
 * `GlideSecureRandomUtil`. The `GlideSecureRandomUtil` class is available in both global and scoped
 *  applications.
 */
/* tslint:disable:unified-signatures */

/**
 * The scoped GlideTime class provides methods for performing operations on GlideTime
 * objects, such as instantiating GlideTime objects or working with GlideTime fields.
 */
/* tslint:disable:unified-signatures */

/**
 * The scoped GlideElementDescriptor API provides information about individual fields.
 *
 * There is no constructor for this class. Use the GlideElement `getED()` method to obtain a
 * GlideElementDescriptor object.
 *
 * Actual type com.glide.db.ElementDescriptor (JavaObject).
 */
/**
 * The Scoped GlideElement API provides a number of convenient script methods for dealing
 * with fields and their values. Scoped GlideElement methods are available for the fields of the
 * current GlideRecord.
 */
/* tslint:disable:unified-signatures no-misused-new */

/**
 * Scoped GlideRecord is used for database operations.
 */
```