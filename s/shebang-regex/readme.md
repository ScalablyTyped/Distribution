
# Scala.js typings for shebang-regex

Typings are for version 3.0.0

## Library description:
Regular expression for matching a shebang line

|                    |                 |
| ------------------ | :-------------: |
| Full name          | shebang-regex |
| Keywords           | re, regex, regexp, shebang, match, test, line |
| # releases         | 1 |
| # dependents       | 55 |
| # downloads        | 284556510 |
| # stars            | 1 |

## Links
- [Homepage](https://github.com/sindresorhus/shebang-regex)
- [Bugs](https://github.com/sindresorhus/shebang-regex/issues)
- [Repository](https://github.com/sindresorhus/shebang-regex)
- [Npm](https://www.npmjs.com/package/shebang-regex)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
Regular expression for matching a [shebang](https://en.wikipedia.org/wiki/Shebang_(Unix)) line.

@example
```
import shebangRegex = require('shebang-regex');

const string = '#!/usr/bin/env node\nconsole.log("unicorns");';

shebangRegex.test(string);
//=> true

shebangRegex.exec(string)[0];
//=> '#!/usr/bin/env node'

shebangRegex.exec(string)[1];
//=> '/usr/bin/env node'
```
*/

```

