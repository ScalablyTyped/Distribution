organization := "org.scalablytyped"
name := "react-intl"
version := "3.9.2-5b07fa"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "1.3.1-8964ae",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.5.1-a564a7",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "2.2.0-084e8e",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "1.6.0-ca20a8",
  "org.scalablytyped" %%% "intl-messageformat" % "7.7.2-6a7f7c",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.5.1-4d776d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191209Z-f85fa6",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        